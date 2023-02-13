import java.util.ArrayList;
import java.util.List;

class User{
    /* ATTRIBUTES : karakteristik dari class user */
    String _name_; 
    String _password_; 
    boolean _membership_;
    boolean _verified = false;


    /* STATIC OBJECT */
    public static List<User> admins; 

    /* STATIC METHOD */
    public static void print_Admins(){
        for (User u : User.admins){
            System.out.println(u.get_name());
        }
    }

    /* OVERRIDING */
    public String toString(){
        return "Your name is " + get_name() + "\nYour password is " + get_pass(); 
    }
    public boolean equals(User u){
        return ((get_name() == u.get_name()) && (get_pass() == u.get_pass()));
    }

    /* KONSTRUKTOR */
    public User(String name, String pass, boolean membership){
        set_name(name);
        set_pass(pass);
        set_membership(membership);
    }
    public User(){
        // System.out.println("INPUT NO DEFINED!");
    }

    /* Getter dan Setter */
    String get_name(){
        return _name_; 
    }    
    void set_name(String name){
        _name_ = name; 
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

    /* getter n setter */
    void set_verified(){
        _verified = true; 
    }
    boolean get_verified(){
        return _verified; 
    }

    void verify(){
        System.out.println("Verifying...");
        set_verified();
    }


    /* METHOD SUATU OBJEK */
    void greeting(){
        System.out.println("Good Morning, " + _name_ + "!");
        System.out.println("Your pass : " + _password_);
        System.out.println("Your membership : \n" + _membership_);

    }

}

class Student extends User{
    void verify(){
        System.out.println("Verifying phone");
        set_verified();
    }
}

class Teacher extends User{
    void verify(){
        System.out.println("Verified email");
        set_verified();
    }
}
/* default : 
 * int : 0
 * String : null
 */

public class trying {
    /* ACTUAL RUNNABLE CLASS */
    public static void main(String[] args){
        /* static data members : Ganti ArrayList<Users> jadi User.admins */
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Mask", "Password", true));
        User.admins.add(new User("Addin", "Password", true));
        User.admins.add(new User("Fani", "Password", true));

        Student s = new Student();
        s.set_verified();
        s.set_name("Testy");

        Teacher t = new Teacher();
        t.set_name("Ally");

        User.admins.add(t);
        User.admins.add(s);

        User.print_Admins();
        for (User u : User.admins){
            u.verify();
        }
    }

}
