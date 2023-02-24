public class driver {
    public static void main(String[] args){
        CasioGraph cs = new CasioGraph(0, 0);
        cs.start();
        System.out.println(cs.checkBattery());
        System.out.println(cs.getStatus());
        System.out.println(cs.substract(3, 1));
    }
}
