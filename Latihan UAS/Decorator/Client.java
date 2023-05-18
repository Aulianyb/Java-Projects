package Decorator;

public class Client {
    public static void main(String[] args){
        Hat h = new Hat(
            new Shirt(
                new Default()
            )
        );

        h.send();
    }
}
