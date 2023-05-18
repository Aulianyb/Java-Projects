package Composite;

public class Client {
    public static void main(String[] args){
        Product p = new Product(); 
        Product p1 = new Product(); 
        Product p2 = new Product();
        InterfaceBox[] item = {p, p1};  
        Box b = new Box(item); 
        InterfaceBox[] item2 = {b, p2};
        Box b2 = new Box(item2); 
        System.out.println("Jumlah : " + b2.getPrice()); 
    }
}
