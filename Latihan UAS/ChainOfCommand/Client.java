package ChainOfCommand;

public class Client {
    public static void main(String[] args){
        ValidUsername v = new ValidUsername(); 
        System.out.println("Jawaban : " + v.handle()); 
    }
    
}
