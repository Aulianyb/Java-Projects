public class Main {
    public static void main(String[] args){
        MyNumber n1 = new MyNumber(1);
        MyNumber n2 = new MyNumber(2); 
        MyNumber n3 = new MyNumber(3); 

        MyNumber[] n = {n1, n2, n3}; 
        Stack <MyNumber> s = new Stack<MyNumber>(n); 
        System.out.println(s.pop()); 
        s.displayTop();
    }
}
