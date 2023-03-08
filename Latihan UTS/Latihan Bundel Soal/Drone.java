public class Drone extends Vehicle{
    private int vSpeed=0; 

    public Drone(Geoloc loc){
        super(loc); 
    }

    public void climb(){
        this.getLocation().setLoc(this.getLocation().getLat(), this.getLocation().getLon(), this.getLocation().getAlt() + 1);
    }

    public void descend(){
        this.getLocation().setLoc(this.getLocation().getLat(), this.getLocation().getLon(), this.getLocation().getAlt() - 1);
    }

    public void accelerate(){
        vSpeed++;  
    }

    public void decelerate(){
        vSpeed--; 
    }

}
