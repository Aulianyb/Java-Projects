public class DelayedCounting {
    private static Thread thread; 
    public static void printDelayed(int delayMillisec, int maxCount){
        thread = new Thread(new Runnable() {
            public void run(){
                for (int i = 1; i <= maxCount; i++){
                    try {
                        Thread.sleep(delayMillisec);
                        System.out.println(i);
                    } catch (InterruptedException e){
                        System.out.println(e.getMessage()); 
                    }
                }
            }
        }); 
        thread.start();
    }
}
