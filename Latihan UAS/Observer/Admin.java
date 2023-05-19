package Observer;
import java.util.*; 

public class Admin {
    private static ArrayList<Customer> customerList; 

    public Admin(){
        customerList = new ArrayList<Customer>(); 
    }

    public static void add(Customer c){
        customerList.add(c);
    }

    public static void notifyCustomer(){
        for (Customer c : customerList){
            c.notified();
        }
    }
}
