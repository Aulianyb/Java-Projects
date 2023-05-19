package InnerClass;

public class Driver {
    public static void main(String[] args){
        OuterClass o = new OuterClass(10);
        OuterClass.InnerClass i = o.new InnerClass(); 
        OuterClass.StaticInnerClass s = new OuterClass.StaticInnerClass();
        o.command();
        i.command();
        s.command();
    }
}
