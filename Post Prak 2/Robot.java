/**
 * Robot.java
 * Superclass Robot
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        // Konstruktor
        this.numberOfParts = numberOfParts;
        this.isActive = isActive; 
    }

    public int getNumberOfParts() {
        // Mengembalikan atribut numberOfParts
        return numberOfParts; 
    }

    public boolean getIsActive() {
        // Mengembalikan atribut isActive
        return isActive; 
    }

    public void setActivation(boolean isActive) {
        // Menetapkan atribut isActive
        this.isActive = isActive; 
    }

    public String toString() {
        // Mengembalikan informasi hewan dengan format: "Number of Parts: {numberOfParts}, IsActive: {isActive}"
        return String.format("Number of Parts: %d, IsActive: %b", this.getNumberOfParts(), this.getIsActive());
    }

    public abstract long getPrice();
}
