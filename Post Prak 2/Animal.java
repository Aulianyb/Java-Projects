/**
 * Animal.java
 * Memodelkan kelas-kelas animal untuk memodelkan hewan di suatu kerajaan hewan
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */

public abstract class Animal {

    private int numberOfLegs;
    private long children;

    public Animal(int numberOfLegs) {
        // Konstruktor, set children = 0
        this.numberOfLegs = numberOfLegs; 
        children = 0; 
    }

    public int getNumberOfLegs() {
        // Mengembalikan atribut numberOfLegs
        return numberOfLegs; 
    }

    public long getNumberOfChildren() {
        // Mengembalikan atribut children
        return children; 
    }

    public void increaseChild(long inc) {
        // Meningkatkan nilai atribut children
        children += inc; 
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: "Number of Legs: {numberOfLegs}, Children: {children}"
        return "Number of Legs: " + numberOfLegs + ", Child: " + children; 
    }

    public abstract long getAnimalPower();
}