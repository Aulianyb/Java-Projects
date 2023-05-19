public class Sinkron {
    
    public static int total; 



    public static synchronized void adder(int x){
        Thread thread = new Thread(new Runnable() {
            public void run(){
                for (int i =0;i<x;i++){
                    total += 1; 
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e){

                    }
                }
            }
        }); 

        thread.start();
    }

    public static synchronized void read(){
        System.out.println(total);
    }
}
