/**
 * Bus.java
 * [Jelaskan kegunaan class ini]
 * @author 18221066 Aulia Nadhirah Yasmin BAdrulkamal
 */
public class Bus extends Car{//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int passengerCapacity;
    private Boolean isUsedForLongTrip;

    public Bus(int numberOfWheels,int engineCapacity, int passengerCapacity, Boolean isUsedForLongTrip) {
        //Konstruktor
        //passengerCapacity merupakan kapasitas penumpang
        //isUsedForLongTrip merupakan status apakah bis dapat digunakan untuk perjalanan jauh
        super(numberOfWheels, engineCapacity);
        this.passengerCapacity = passengerCapacity; 
        this.isUsedForLongTrip = isUsedForLongTrip;  
    }

    public int getPassengerCapacity(){
        //Mengembalikan nilai dari kapasitas penumpang
        return passengerCapacity; 
    }

    public Boolean getLongTripStatus(){
        //Mengembalikan status dari bis apakah dapat digunakan untuk perjalanan jauh
        return isUsedForLongTrip; 
    }    
    public String sound(){
        //Mengembalikan string berisi "Cesss"
        return "Cesss"; 
    }

    public String honk(){
        //Mengembalikan string berisi "Notnot"
        return "Notnot";
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isUsedForLongTrip true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
        //Apabila isUsedForLongTrip false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan tidak digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
        if (isUsedForLongTrip){
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan digunakan untuk perjalanan jauh", this.getNumberOfWheels(), this.getEngineCapacity(), passengerCapacity); 
        }
        else{
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan tidak digunakan untuk perjalanan jauh", this.getNumberOfWheels(), this.getEngineCapacity(), passengerCapacity);
        }
    }
}
