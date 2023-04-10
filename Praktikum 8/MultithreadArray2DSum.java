import java.util.ArrayList;

public class MultithreadArray2DSum {

    private int nWorkers;
    private ArrayList<Integer[]> array;
    private int sum2D;

    MultithreadArray2DSum(int nWorkers, ArrayList<Integer[]> array) {
        // Inisialisasi attributes
        this.nWorkers = nWorkers;
        this.array = array;
        sum2D = 0;
    }

    public int calculateSum2() throws InterruptedException {
        // calculateSum2 akan membuat thread dan memetakan array 2 dimensi masukan secara rata ke semua threads yang dapat dibuat
        // setiap thread akan menghitung jumlah dari setiap baris array
        // gunakan fungsi findSum pada kelas MultithreadArraySum untuk menghitung setiap baris array
        int spread2D = array.size() / nWorkers;
        Thread[] threadCalculators2D = new Thread[nWorkers];

        for (int i = 0; i<nWorkers; i++){
            int start2D = i * spread2D;
            int end2D;
            if (i == nWorkers - 1){
                end2D = array.size();
            }
            else{
                end2D = (i+1) * spread2D;
            }

            // bagian threadnya
            threadCalculators2D[i] = new Thread(new Runnable(){
                public void run(){
                    int threadSum = 0;
                    for (int j = start2D; j < end2D; j++){
                        MultithreadArraySum mas = new MultithreadArraySum(nWorkers, array.get(j));
                        try{
                            threadSum += mas.calculateSum();
                        }
                        catch (InterruptedException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    synchronized (this){
                        sum2D += threadSum;
                    }
                }
            });
            threadCalculators2D[i].start();
        }

        //tungguin thread lain
        for (int k = 0; k < nWorkers; k++){
            threadCalculators2D[k].join();
        }

        return sum2D;
        
    }

    protected int findSum(MultithreadArraySum arraySum) throws InterruptedException {
        // findSum menerima parameter arraySum berupa kelas MultithreadArraySum yang diinisiasi
        // setiap baris pada array 2 Dimensi untuk menghitung total penjumlahan setiap baris
        return arraySum.calculateSum();
    }

    public static void main(String[] args) {
        // Please provide your solution in the space below
        ArrayList<Integer[]> array = new ArrayList<>();
        array.add(new Integer[] {1,2,3});
        array.add(new Integer[] {4,5});
        MultithreadArray2DSum array2DSum = new MultithreadArray2DSum(2, array);
        try {
            System.out.println(array2DSum.calculateSum2());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}