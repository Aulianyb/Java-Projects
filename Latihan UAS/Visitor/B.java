package Visitor;

public class B implements Elemen{
    public B(){

    }

    public void Accept(Visitor visitor){
        visitor.visitB(this);
    }
}
