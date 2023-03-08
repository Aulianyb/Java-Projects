public class MinOp {

    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        int x; 
        int satuan=0;  
        int maxBagi=0;
        int p;  
        for (int i=0;i<arrNum.length;i++){
            p = 0; 
            x = arrNum[i].intValue();
            if (!(x == 0)){
                if (!(x % 2 ==0)){
                    satuan++; 
                    x--; 
                }
                while (x > 1){
                    x >>= 1; 
                    p++; 
                }
                maxBagi = Math.max(p, maxBagi); 
                satuan ++; 
            }
        }
        return satuan + maxBagi - 1; 
    }
}