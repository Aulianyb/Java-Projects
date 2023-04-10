public class Driver {
    public static void main(String[] args) throws InterruptedException{
        // DelayedCounting.printDelayed(200, 3);
        // DelayedCounting.printDelayed(100, 1);

        // Practice P = new Practice(); 
        // Practice2 P_two = new Practice2();
        // Thread thread = new Thread(P_two);


        // P.start(); 
        // P.join(3000); 
        // thread.start();
        Integer[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        MultithreadArraySum M = new MultithreadArraySum(3, r); 
        System.out.println(M.calculateSum()); 
    }
}
