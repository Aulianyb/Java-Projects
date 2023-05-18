package Decorator;

public class Shirt extends BaseSkin {
    public Shirt(SkinInterface x){
        super(x); 
    }

    public void send(){
        super.send();
        System.out.println("Ini Shirt"); 
    }
}
