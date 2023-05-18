public class MultithreadArraySum {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;
    private int sum; 

    MultithreadArraySum(int nWorkers, Integer[] array) {
       // Inisialisasi attributes
       // Please provide your solution in the space below
       this.nWorkers = nWorkers; 
       this.array = array; 
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke semua threads yang dapat dibuat
        // Please provide your solution in the space below
        int size = array.length / nWorkers; 
        Thread[] thread = new Thread[nWorkers];
        for (int i=0;i<nWorkers;i++){
            int start = size * i; 
            int end; 
            if (i == nWorkers-1){
                end = array.length; 
            }
            else{
                end = start + size; 
            }
            thread[i] = new Thread(new Runnable(){
                public void run(){
                    synchronized(this){
                        System.out.println(start + " " + end + " "); 
                        sum += findSum(start, end); 
                    }
                }
            }); 
            thread[i].start(); 
        } 
        

        for (int j=0; j < nWorkers;j++){
            thread[j].join();
        }

        return sum; 
    }

    protected int findSum(int start, int end) {
       // findSum akan melakukan penjumlahan elemen-elemen array pada index start sampai end-1
       // Please provide your solution in the space below
       int res = 0; 
        for (int i=start;i<end;i++){
            res += array[i]; 
        }
       return res; 
    }
}
