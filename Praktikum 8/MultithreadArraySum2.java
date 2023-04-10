public class MultithreadArraySum2 {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;
    private int sum;

    MultithreadArraySum2(int nWorkers, Integer[] array) {
       // Inisialisasi attributes
       // Please provide your solution in the space below
       this.nWorkers = nWorkers;
       this.array = array;
       sum = 0;
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke semua threads yang dapat dibuat
        // Please provide your solution in the space below
        int spread = array.length / nWorkers;
        Thread[] threadCalculators = new Thread[nWorkers];

        for (int i = 0; i < nWorkers; i++){
            int start = i * spread;
            int end;
            if (start == nWorkers -1){
                end = array.length;
            }
            else{
                end = (i+1) * spread;
            }
            threadCalculators[i] = new Thread(new Runnable(){
                public void run(){
                    int threadSum = findSum(start, end);
                    synchronized (this){
                        sum+= threadSum;
                    }
                }
            });
            threadCalculators[i].start();
        }

        // tunggu semua thread kelar ngitung
        for (int j = 0; j<nWorkers; j++){
            threadCalculators[j].join();
        }
        return sum;

    }

    protected int findSum(int start, int end) {
       // findSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
       // Please provide your solution in the space below
       int total = 0;
       for (int i = start; i<end; i++){
        total += array[i];
       }
       return total;
       
    }
}
