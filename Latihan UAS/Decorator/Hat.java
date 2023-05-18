package Decorator;

public class Hat extends BaseSkin{
    public Hat(SkinInterface x){
        super(x); 
    }

    public void send(){
        super.send();
        System.out.println("Ini hat"); 
    }
}
