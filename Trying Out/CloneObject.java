public class CloneObject implements Clone{
    private int x; 

    public CloneObject(int x){
        this.x = x; 
    }

    public int getX(){
        return x; 
    }

    public CloneObject cloneThis(){
        return new CloneObject(x); 
    }

}
