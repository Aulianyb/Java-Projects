
public abstract class Animal{
    private int numberOfLegs; 
    private long children;

    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
        children = 0; 
    }

    public int getNumberofLegs(){
        return numberOfLegs; 
    }

    public long getNumberofChildren(){
        return children; 
    }

    public void increaseChild(long inc){
        children += inc; 
    }

    // public String toString(){
       // return String.format("Number of Legs: %d, Child: %d", this.getNumberofLegs(), this.getNumberofChildren()); 
    // }

    public abstract long getAnimalPower(); 
}