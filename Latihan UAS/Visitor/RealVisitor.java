package Visitor;

public class RealVisitor implements Visitor { 
    public void visitA(A a){
        System.out.println("A is Visited!"); 
    }
    public void visitB(B b){
        System.out.println("B is Visited!"); 
    }
}
