package ChainOfCommand;
import java.util.*; 

public class ValidPassword implements Handler {
    
    public ValidPassword(){
        
    }

    public boolean handle(){
        Scanner scan = new Scanner(System.in); 
        String x = scan.nextLine(); 
        if (x.equals("123")){
            return true; 
        }
        return false; 
    }
}
