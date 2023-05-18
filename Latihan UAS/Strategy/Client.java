package Strategy;

public class Client {
    public static void main(String[] args){
        Context c = new Context(); 
        c.setStrategy(); 
        c.execute(); 
    }
}
