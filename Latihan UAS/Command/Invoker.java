public class Invoker {
    Command command; 

    

    public Invoker (Command command){
        this.command = command; 
    }

    public void executeCommand(){
        command.execute();
    }
}
