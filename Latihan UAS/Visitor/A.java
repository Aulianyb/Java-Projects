package Visitor;

public class A {
    public A(){

    }

    public void Accept(Visitor visitor){
        visitor.visitA(this);
    }
}
