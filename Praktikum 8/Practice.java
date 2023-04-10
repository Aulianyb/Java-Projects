public class Practice extends Thread {
    @Override
    public void run(){
        for (int i = 0;i<= 10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread 1 : " + i);
            } catch (InterruptedException e){
                System.out.println(e.getMessage()); 
            }
        }
        System.out.println("Thread 1 is Done"); 
    }
}
