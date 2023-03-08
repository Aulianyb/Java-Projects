public abstract class Vehicle implements Moveable {
    private Geoloc loc;
    private int speed;
    private static int numVehicle; 
    
    public Vehicle(Geoloc loc){
        this.loc = loc; 
        numVehicle++; 
    }

    public Geoloc getLocation(){
        return loc; 
    }    

    public static int getNumVehicle(){
        return numVehicle; 
    }

    public void moveTo(Geoloc newLoc){
        this.loc = newLoc; 
    }

    public abstract void accelerate(); 
    public abstract void decelerate(); 
}
