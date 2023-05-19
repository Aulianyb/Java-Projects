/**
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */
public class DelayedCounting{
    public static void printDelayed(int delayMillisec, int maxCount) {
        Thread thread = new Thread(new Runnable(){
            public void run(){
                for(int i=1;i<=maxCount;i++){
                    try{
                        System.out.println(i); 
                        Thread.sleep(delayMillisec);
                    } catch (InterruptedException e){

                    }
                }
            }
        }); 
        thread.start();
    }
}