public class MainVehicle {
    public static void main(String[] args){
        Geoloc g1 = new Geoloc(2, 1, 10);
        Geoloc g2 = new Geoloc(11, 99, 44);
        Drone d1 = new Drone(g1);
        d1.accelerate();
        d1.decelerate();
        d1.climb();
        d1.descend();
        d1.moveTo(g2);

        System.out.println(Vehicle.getNumVehicle()); 

    }
}
