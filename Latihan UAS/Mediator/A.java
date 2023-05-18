package Mediator;

public class A implements Mediator{
    int x;
    ConcreteMediator mediator; 
    public A(ConcreteMediator m, int x){
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
