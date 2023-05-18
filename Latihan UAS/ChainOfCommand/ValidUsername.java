package ChainOfCommand;
import java.util.*;

public class ValidUsername implements Handler{
    Handler handler; 

    public ValidUsername(){
        handler = new ValidPassword();
    } 

    public boolean handle(){
        Scanner scan = new Scanner(System.in); 
        String x = scan.nextLine(); 
        if (x.equals("baba")){
            return handler.handle(); 
        }
        return false; 
    }   
}
