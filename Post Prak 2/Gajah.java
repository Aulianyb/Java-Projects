/**
 * Gajah.java
 * Subclass binatang Gajah
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */

public class Gajah extends Animal {

    private long basePower;
    private long jumlahGading;

    public Gajah(long basePower, int jumlahGading) {
        // Konstruktor, jumlah gading minimal 0 maksimal 2
        super(4); 
        this.basePower = basePower; 
        if (jumlahGading <= 2 && jumlahGading >= 0){
            this.jumlahGading = jumlahGading; 
        }
        else if (jumlahGading > 2){
            this.jumlahGading = 2; 
        }
        else if (jumlahGading < 0){
            this.jumlahGading = 0; 
        }
    }

    public long getJumlahGading(){
        // Mengembalikan jumlahGading
        return jumlahGading; 
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan Gajah dengan formula 3 * basePower * (1 + jumlahGading)
        return 3 * basePower * (1 + jumlahGading); 
    }
}