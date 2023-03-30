//bisa di bounded dengan Thing extends Number
public class GenericMomen<Thing, Thing1>{
    private Thing x; 
    private Thing1 y; 

    public GenericMomen(Thing x, Thing1 y){
        this.x = x; 
        this.y= y; 
    }

    public Thing getMomenx(){
        return x; 
    }

    public Thing1 getMomeny(){
        return y; 
    }

    public void display_result(){
        System.out.println(x + " AND " + y); 
    }
    
}
