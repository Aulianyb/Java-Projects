public class Cape {
    public static void main(String[] args){
        MaskPiiss M = new MaskPiiss(); 
        MaskPII M1 = new MaskPII(); 
        Auh A = new Auh(); 
        System.out.println(M.maskPhoneNumber_alt("13245678902")); 
        System.out.println(M1.maskPII("1324567idhasdgjahdjkas8902")); 


        Number[] maskpiss = {2, 4}; 
        MinOp M2 = new MinOp(); 
        System.out.println(M2.minimumOperationsNeeded(maskpiss)); 
        System.out.println(A.minimumOperationsNeeded(maskpiss)); 
    }
}
