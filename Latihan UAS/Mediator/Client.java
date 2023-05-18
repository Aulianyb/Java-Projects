package Mediator;

public class Client {
    public static void main(String[] args){
        ConcreteMediator m = new ConcreteMediator(); 
        A a = new A(m, 10); 
        A a2 = new A(m, 3); 
        B b = new B(m, 5); 
        B b1 = new B(m, 6); 

        a.execute();
        a2.execute();
        b.execute();
        b1.execute();
    }
}
