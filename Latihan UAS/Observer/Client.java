package Observer;

public class Client {
    public static void main(String[] args){
        Admin a = new Admin(); 
        Customer c = new Customer("Natalie"); 
        Customer c1 = new Customer("Trudy"); 
        Customer c2 = new Customer("Alex");
        
        Admin.notifyCustomer();

    }
}
