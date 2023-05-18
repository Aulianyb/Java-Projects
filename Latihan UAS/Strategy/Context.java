package Strategy;
import java.util.*; 

public class Context {
    Strategy strategy; 

    public Context(){

    }

    public void setStrategy(){
        Scanner s = new Scanner(System.in); 
        String inp = s.nextLine(); 
        if (inp.equals("indo")){
            strategy = new Indo(); 
        } else{
            strategy = new English(); 
        }
    }

    public void execute(){
        Scanner s = new Scanner(System.in); 
        String inp = s.nextLine(); 
        strategy.printer(inp);
    }
}
