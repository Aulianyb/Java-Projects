public class ConcreteCommand implements Command{
    Receiver receiver; 
    String param; 

    public ConcreteCommand (Receiver x){
        receiver = x; 
    }

    public void execute(){
        receiver.method();
    }
}
