public class Driver {
    public static void main(String[] args) throws InterruptedException{
        DelayedCounting.printDelayed(2000, 3, "Thread 1");
        DelayedCounting.printDelayed(1000, 3, "Thread 2");

        // Practice P = new Practice(); 
        // Practice2 P_two = new Practice2();
        // Thread thread = new Thread(P_two);


        // P.start(); 
        // P.join(3000); 
        // thread.start();
        // Integer[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        // MultithreadArraySum M = new MultithreadArraySum(3, r); 
        // System.out.println(M.calculateSum()); 
    }
}
