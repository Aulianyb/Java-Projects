public class DelayedCounting {
    private static Thread thread; 
    public static void printDelayed(int delayMillisec, int maxCount, String word){
        thread = new Thread(new Runnable() {
            public void run(){
                for (int i = 1; i <= maxCount; i++){
                    try {
                        Thread.sleep(delayMillisec);
                        System.out.println(i);
                        System.out.println(word); 
                    } catch (InterruptedException e){
                        System.out.println(e.getMessage()); 
                    }
                }
            }
        }); 
        thread.start();
    }
}
