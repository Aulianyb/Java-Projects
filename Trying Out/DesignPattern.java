public class DesignPattern{
    private static DesignPattern instance; 
    private int x; 

    private DesignPattern(){
        this.x = 933; 
    }

    public static DesignPattern getInstance(){
        if (instance == null){
            instance = new DesignPattern();  
        }
        return instance; 
    }

    public int getX(){
        return x; 
    }

}