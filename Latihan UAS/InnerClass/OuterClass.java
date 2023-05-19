package InnerClass;

public class OuterClass {
    int x; 

    public OuterClass(int x){
        this.x = x; 
    }

    public void command(){
        System.out.println("Ini OuterClass " + x);


        class localInnerClass{
            String s; 

            public void command(){
                //bisa pake variabel yang dimiliki oleh outer class
                System.out.println("Ini Local Inner Class " + x);
            }
        }

        localInnerClass l = new localInnerClass(); 
        l.command();
    }

    public class InnerClass{
        public InnerClass(){

        }

        public void command(){
            System.out.println("Ini InnerClass");
        }
    }

    public static class StaticInnerClass{
        public StaticInnerClass(){

        }
        
        public void command(){
            System.out.println("Ini StaticInnerClass");
        }
    } 
}
