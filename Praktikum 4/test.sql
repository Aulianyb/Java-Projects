COMPILING EVERY SINGLE SQL CODE IN THIS ONE DOCUMENT 
(SEMANGAT!!!)

// ini placeholder
SELECT * 
FROM Physician
WHERE position LIKE '%A%';

//cara lihat timing, cara kerja
EXPLAIN ANALYZE [insetr query]; 

//CARA MEMBUAT INDEX : 

CREATE INDEX [nama index] ON [nama table]; 

CREATE INDEX [nama index] ON [nama table](column); 

CREATE INDEX [nama index] ON [nama table](column1, column2); 

CREATE INDEX [nama index] ON [nama table](condition); 

CREATE INDEX hash_name ON physician USING hash(name); 

CREATE INDEX p_position ON physician USING btree(name); 

//ngerjain PRAK1 MBD
Info butuh : nama pasien, no ruang
end date >= 01-01-2019

EXPLAIN ANALYZE 
SELECT name, room
FROM patient JOIN stay ON (SSN = patient)
WHERE stayEnd >= '01-01-2019'; 

CREATE TABLE active_patient PARTITION OF stay FOR StayEnd >= '01-01-2019';

//ini partition

//HORIZONTAL SPLITTING
CREATE TABLE [nama table] AS (
	SELECT *
	FROM [asal]
	WHERE [condition]
)

contoh : 
CREATE TABLE [nama table] AS (
	SELECT *
	FROM [asal]
	WHERE [condition]
)

EXPLAIN ANALYZE
SELECT name, room
FROM active_patients; 

ada yang namanya itu inherits dan partitioned table tapi aku ga ngerti cara aplikasinya gimana :) 

no 2 : 
Need ID, nama perawat 
bekerja di lantai 1 dan 2 
mengakhiri shift : 1 januari - 5 januari 2018
desc id 
TOP 5


//lets say ini itu kalau misalnya ada di lantai 1 atau 2
SELECT DISTINCT EmployeeID, nurse.Name
FROM Nurse JOIN on_call ON (Nurse = EmployeeID)
WHERE (OnCallEnd BETWEEN '01-01-2018' AND '05-01-2018') AND (BlockFloor = 1 OR BlockFloor = 2) 
ORDER BY EmployeeID desc
LIMIT(5); 

//ini kalau misalnya ada di lantai 1 DAN 2

SELECT EmployeeID, Name
FROM Nurse JOIN on_call ON (Nurse = EmployeeID)
WHERE EmployeeID IN (	
	SELECT EmployeeID
	FROM Nurse JOIN on_Call ON (Nurse = EmployeeID)
	WHERE BlockFloor = 1
) AND BlockFloor = 2 AND onCallEnd BETWEEN '01-01-2018' AND '05-01-2018'
ORDER BY EmployeeID desc
LIMIT(5); 

SCHEMA TUNING
untuk mengurangi dilakukannya JOIN maka bisa di add atribut Name ke On_Call (redundant attribute, denormalisasi)

UPDATE on_call
SET name = nurse.name
FROM Nurse
WHERE employeeID = nurse;

UPDATE [table]
SET [atribut] = [nama tabel 2].[nama atribut]
FROM [nama tabel 2]
WHERE [foreign key yang menyatukan]


SETELAH TUNING : 


SELECT nurse, name
FROM on_Call
WHERE (oncallEnd BETWEEN '01-01-2018' AND '05-01-2018') AND (BlockFloor = 1 OR BlockFloor = 2)
ORDER BY nurse desc
LIMIT(5);

Perbedaan cukup bagus, 1.4 -> 0.8

No 4 di praktikum

SELECT DISTINCT SSN, patient.Name, Address, Phone, InsuranceID, PCP FROM
(Prescribes JOIN Patient ON(Patient = SSN)) JOIN Medication ON (code = medication)
WHERE medication.name LIKE 'Crescavitin'
ORDER BY SSN asc
LIMIT(10);

Kita bisa tuning dengan menambahkan Name ke prescribes (redundant column) → 85 ms

ALTER TABLE Prescribes ADD COLUMN Medication_name VARCHAR(30);

4749 ms update
UPDATE prescribes
SET Medication_name = medication.name
FROM medication
WHERE medication = code; 

SELECT DISTINCT SSN, name, address, phone, insuranceID, PCP
FROM Patient JOIN Prescribes ON (SSN = patient)
WHERE Medication_name LIKE 'Crescavitin'
ORDER BY SSN asc
LIMIT(10);

i mean it kinda berkurang

//No 5

MEMBUAT MATERIALIZED VIEW :

nama pasien, nama obat, jumlah dosis 
sum(dosis)
order by name, medication asc 

QUERY TANPA MATERIALIZED VIEW : 
SELECT name, Medication_name, SUM(CAST(Dose AS INT))
FROM patient JOIN prescribes ON (SSN = Patient)
GROUP BY name, Medication_name
ORDER BY name, medication_name asc;

kita dapet : 197 ms

CREATE MATERIALIZED VIEW total_dose AS (
    SELECT name, Medication_name, SUM(CAST(Dose AS INT))
    FROM patient JOIN prescribes ON (SSN = Patient)
    GROUP BY name, Medication_name
    ORDER BY name, medication_name asc);

kita dapet : 3 ms


CONTOH LATIHAN INDEX : 
Pertama, coba kamu ingat 
    EXPLAIN ANALYZE [query]
    CREATE INDEX id_medicine_name ON prescribes USING hash(medicine_name);
    EXPLAIN ANALYZE SELECT DISTINCT medication_name FROM prescribes WHERE medication_name LIKE '%A%';

    coba buat yang binary tree ya 
	CREATE INDEX b_names ON prescribes USING btree(medication_name); 

	DELETE FROM patient WHERE SSN = 40;