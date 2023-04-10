public class Practice2 implements Runnable {
    public void run(){
        for (int i = 10;i>=0;i--){
            try {
                Thread.sleep(1000);
                System.out.println("Thread 2 : " + i);
            } catch (InterruptedException e){
                System.out.println(e.getMessage()); 
            }
        }
        System.out.println("Thread 2 is Done"); 
    }
}
