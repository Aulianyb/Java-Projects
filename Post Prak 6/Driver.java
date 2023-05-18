public class Driver {
    public static void main(String[] args){
        GenericStack<Integer> test = new GenericStack<Integer>(); 
        test.push(10);
        System.out.println(test.toString()); 
        test.push(30);
        test.push(40); 
        test.push(50); 
        System.out.println(test.toString()); 
        System.out.println(test.pop()); 
        System.out.println(test.toString()); 
        test.clear();
        System.out.println(test.toString()); 
        test.push(30);
        test.push(40); 
        test.push(50); 
        test.push(90); 
        test.push(60); 
        System.out.println(test.toString()); 
        test.push(40); 
        test.push(50); 
        test.push(90); 
        System.out.println(test.toString()); 
        test.remove(0);
        System.out.println(test.toString()); 
        System.out.println(test.contains(50)); 


    }
}
