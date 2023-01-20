class User{
    String _name_; 
    String _password_; 
    boolean _membership_;

    public String toString(){
        return "Your name is " + get_name() + "\nYour password is " + get_pass(); 
    }

    public User(String name, String pass, boolean membership){
        set_name(name);
        set_pass(pass);
        set_membership(membership);
    }

    public User(){
        System.out.println("INPUT NO DEFINED!");
    }

    String get_name(){
        return _name_; 
    }    

    void set_name(String name){
        _name_ = name; 
        System.out.println("name is changed to " + _name_);
    }

    String get_pass(){
        return _password_; 
    }

    void set_pass(String pass){
        _password_ = pass; 
    }

    void add_pass(String pass){
        _password_ += pass; 
    }

    void add_pass(int pass){
        _password_ += pass; 
    }

    void set_membership(boolean mem){
        _membership_ = mem; 
    }

    void greeting(){
        System.out.println("Good Morning, " + _name_ + "!");
        System.out.println("Your pass : " + _password_);
        System.out.println("Your membership : " + _membership_);

    }

}

/* default : 
 * int : 0
 * String : null
 */

public class trying {

    public static void main(String[] args){
        User u = new User("Mask", "Mamaa", true);
        u.greeting();

        System.out.println(u);
    }

}
