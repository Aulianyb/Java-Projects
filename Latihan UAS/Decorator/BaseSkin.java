package Decorator;

public class BaseSkin implements SkinInterface {
    private final SkinInterface wrapper; 
    
    public BaseSkin(SkinInterface wrapper){
        this.wrapper = wrapper; 
    }
    
    public void send(){
        wrapper.send();
    }  
}
