public class MainStack {
    public static void main(String[] args){
        MyNumber x = new MyNumber(10); 
        MyNumber y = new MyNumber(20); 
        MyNumber[] myNumberArray = {x, y, x}; 
        Stack<MyNumber> s = new Stack<MyNumber>(myNumberArray); 
        s.displayTop();
        s.push(x);
        System.out.println(s.pop()); 
        System.out.println(s.pop()); 
        System.out.println(s.pop()); 
        System.out.println(s.pop()); 
    }
}
