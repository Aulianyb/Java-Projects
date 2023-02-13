import java.util.Scanner; 

public class lift {

    String _state_;
    int _lantai_; 
    boolean _moving_; 

    public String toString(){
        return "Lift ini sedang bergerak " + get_state() + " ada di lantai ke-" + get_lantai() + " dan sedang moving adalah " + moving_state();  
    }

    public lift(String state, int lantai, boolean move){
        set_lantai(lantai);
        set_state(state);
        set_move(move);
    }

    String get_state(){
        return _state_; 
    }

    void set_state(String state){
        _state_ = state; 
    }

    int get_lantai(){
        return _lantai_; 
    }

    void set_lantai(int lantai){
        _lantai_ = lantai; 
    }

    boolean moving_state(){
        return _moving_; 
    }

    void set_move(boolean move){
        _moving_ = move; 
    }

    static void operation(lift lift_){
        Scanner scanline = new Scanner(System.in);
        boolean run = true; 
        while(run){
            System.out.println(lift_._state_);
            System.out.println("Naik atau Turun?");
            lift_._state_ = scanline.nextLine(); 
            while (!lift_._state_.equals("Naik") && !lift_._state_.equals("Turun")){
                System.out.println("Level : "lift_._state_);
                System.out.println("INPUT INVALID : Naik atau Turun?");
                lift_._state_ = scanline.nextLine();     
            }
            System.out.println("ke lantai berapa?");
            lift_._lantai_ = scanline.nextInt();    
        }
    }

    public static void main(String[] args){
        lift lift_1 = new lift("Naik", 1, false);
        operation(lift_1);
    }
}