package Composite;

public class Product implements InterfaceBox {
    private int cost; 

    public Product(){
        cost = 100; 
    }

    public int getPrice(){
        return cost; 
    }
}
