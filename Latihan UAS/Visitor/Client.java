package Visitor;
import java.util.*;

public class Client {
    public static void main(String[] args){
        RealVisitor r = new RealVisitor(); 
        RealVisitor r1 = new RealVisitor(); 
        RealVisitor r2 = new RealVisitor();
        A a = new A(); 
        B b = new B(); 


        List<Visitor> listV = new ArrayList<Visitor>();
        listV.add(r);
        listV.add(r1); 
        listV.add(r2);
        
        for (Visitor v : listV){
            a.Accept(v);
            b.Accept(v);
        }
    }
}
