package Mediator;

public class B implements Mediator {
    ConcreteMediator mediator;
    int x;  

    public B(ConcreteMediator m, int x){
        mediator = m; 
        this.x = x; 
    }

    public void execute(){
        mediator.execute(this); 
    }

    public int getX(){
        return x; 
    }
}
