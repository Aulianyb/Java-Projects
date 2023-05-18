public class Client {
    public static void main(String[] args){
        Receiver r = new Receiver(); 
        Invoker i = new Invoker( new ConcreteCommand(r)); 

        i.executeCommand();

    }
}
