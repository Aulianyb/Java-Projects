public class Rectangle {
    private int width; 
    private int length; 
    private Point origin;
    
    public int get_width(){
        return width; 
    }

    public int get_length(){
        return length;
    }

    public void set_width(int w){
        width = w; 
    }

    public void set_length(int l){
        length = l; 
    }

    public void move(int a, int b){
        origin.x = a; 
        origin.y = b; 
    }

    public Rectangle(int w, int l, Point o){
        set_width(w);
        set_length(l);
        origin = o; 
    }

    public void printStates(){
        
    }

}
