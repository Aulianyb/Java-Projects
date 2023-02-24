public abstract class Animal {
    private int legs;
    private String food_type;

    public Animal(int legs, String food_type){
        this.legs = legs; 
        this.food_type = food_type; 
    }
    
    public int getLegs(){
        return legs; 
    }

    public String getFood(){
        return food_type; 
    }

    public abstract void move();
}
