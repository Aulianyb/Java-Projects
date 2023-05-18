package Composite;

public class Box implements InterfaceBox{
    private InterfaceBox[] items; 
    private int cost; 

    public Box(InterfaceBox[] items){
        this.items = items; 
        cost = 10; 
    }

    public int getPrice(){
        int total = cost; 
        for (int i=0;i<items.length;i++){
            total += items[i].getPrice(); 
        }
        return total; 
    }

}
