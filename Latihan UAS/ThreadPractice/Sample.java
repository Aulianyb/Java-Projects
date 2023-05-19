package ThreadPractice;

public class Sample extends Thread{
    @Override
    public void run(){
        Integer[] list = {1, 2, 3, 4}; 
        for (Integer x : list){
            System.out.println(x);
            try{
                Thread.sleep(1000 ); 
            } catch (InterruptedException e){

            }
        }
    }
}
