public class AlternateTwo implements Runnable{
    int delayMillisec; 
    int x; 


    public AlternateTwo(int x, int delayMillisec){
        this.delayMillisec = delayMillisec; 
        this.x = x; 
    }

    @Override
    public void run(){
        try{
            Thread.sleep(delayMillisec);
            System.out.println("Thread " + x); 
        } catch (InterruptedException e){
            
        }
    }
}
