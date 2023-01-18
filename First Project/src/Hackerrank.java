public class Hackerrank {
    public static void main(String[] args) throws Exception{
        String s1=sc.next();
            int x=sc.nextInt();
            String blank = " ";
                
            if (x < 100){
                x = '0' + x; 
            }
                
            System.out.println(s1 + blank.repeat(15) + x);

    }
}
