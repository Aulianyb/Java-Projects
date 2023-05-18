import java.util.*;

public class Wahoo {
    public Wahoo(){

    }   

    public int divide(){
        Scanner s = new Scanner(System.in); 
        
        int x = s.nextInt(); 
        int y = s.nextInt(); 
        int z = 0; 

        s.close();
        try {
            z = x / y;  
        } catch(ArithmeticException e){
            System.out.println("Oopsie"); 
        } finally{
            s.close();
        }
        return z; 
    }
}
