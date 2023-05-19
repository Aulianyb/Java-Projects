public class Driver {
    public static void main(String[] args){
        // DelayedCounting.printDelayed(200, 3);
        // DelayedCounting.printDelayed(100, 1);

        AlternateOne a = new AlternateOne(1, 1000); 
        AlternateOne a1 = new AlternateOne(2, 100); 
        // AlternateOne a2 = new AlternateOne(3, 2000); 
        // Thread t = new Thread (new AlternateTwo(12, 1111)); 
        // Thread t1 = new Thread (new AlternateTwo(13, 2222)); 

        // a.start();
        // a1.start();
        // a2.start();
        // t.start();
        // t1.start();

        Sinkron.adder(5);
        Sinkron.read();

    }
}
