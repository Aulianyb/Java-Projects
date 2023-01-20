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

    static void operation(){
        Scanner scanline = new Scanner(System.in);

        System.out.println("Naik atau Turun?");
        String state = scanline.nextLine(); 
        while (!state.equals("Naik") && !state.equals("Turun")){
            System.out.println("INPUT INVALID : Naik atau Turun?");
            state = scanline.nextLine();     
        }
        System.out.println("ke lantai berapa?");
        int lantai = scanline.nextInt(); 
    }

    public static void main(String[] args){
        lift lift_1 = new lift("Naik", 3, true);
        System.out.println(lift_1);
        operation();
    }
}