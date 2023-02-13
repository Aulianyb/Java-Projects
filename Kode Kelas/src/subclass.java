public class subclass extends Superclass {
    int b; 
    public subclass(int x, int y){
        super(x);
        b = y; 
    }

    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in SubClass");
    }
    public static void main(String[] args){
        subclass s = new subclass(); 
        s.printMethod();
    }
}
