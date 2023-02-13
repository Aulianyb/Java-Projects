/**
 * Serigala.java
 * Subclass serigala untuk Animal
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */

public class Serigala extends Animal {

    private long basePower;
    private boolean kawanan;

    public Serigala(long basePower, boolean kawanan) {
        // Konstruktor
        super(4);
        this.basePower = basePower; 
        this.kawanan = kawanan; 
    }

    private boolean hasKawanan(){
        // Mengembalikan state apakah ia memiliki kawanan atau tidak
        return kawanan; 
    }

    @Override
    public long getAnimalPower() {
        // Mengembalikan kekuatan serigala.
        // Apabila ia memiliki kawanan dan anak, formulanya basePower * 3 * children
        // Selain itu, kekuatan hanya bernilai basePower
        if (kawanan){
            if (this.getNumberOfChildren() <= 0){
                return basePower; 
            }
            else{
                return basePower * 3 * this.getNumberOfChildren();
            }
        }
        else{
            return basePower; 
        }
    }
}