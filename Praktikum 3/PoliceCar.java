public class PoliceCar implements TrackableVehicle {
    private String plateNumber; 
    private Point gpsPosition; 
    private int speed; 
    private String direction;
    private int wheel; 
    private String fuelType; 
    private Boolean started; 

    public PoliceCar(String platenumber, Point gpsPosition, int speed, int wheel, String fuelType){
        this.plateNumber = platenumber; 
        this.gpsPosition = gpsPosition; 
        this.speed = speed;
        this.fuelType = fuelType; 
        this.direction = "North";
        this.started = false;
    }

    public int getNumberOfWheels(){
        return wheel; 
    }

    public int getMaxSpeed(){
        return speed; 
    }

    public String getFuelType(){
        return fuelType; 
    }

    public void start(){
        started = true;
    }

    public void stop(){
        started = false; 
    }

    public String getPlateNumber(){
        return plateNumber; 
    }

    public Point getGPSPosition(){
        return gpsPosition; 
    }

    public String getDirection(){
        return direction; 
    }

    public boolean getStarted(){
        return started;
    }

    public void turn(String direction){
        this.direction = direction; 
    }
}
