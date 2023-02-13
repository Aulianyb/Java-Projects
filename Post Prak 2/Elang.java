/**
 * Elang.java
 * Subclass Elang
 * @author 18221066 Aulia Nadhirah Yasmin B
 */

public class Elang extends Animal {

    private long basePower;
    private int jumlahTelur;

    public Elang(long basePower) {
        // Konstruktor, set jumlahTelur ke 0
        super(2);
        this.basePower = basePower; 
        jumlahTelur = 0; 
    }

    public int getJumlahTelur(){
        // Mengembalikan atribut jumlahTelur
        return jumlahTelur; 
    }

    public void bertelur(){
        // Menambah jumlahTelur dengan 1
        jumlahTelur += 1; 
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan Elang dengan formula basePower * children - jumlahTelur
        return basePower * this.getNumberOfChildren() - jumlahTelur; 
    }
}