package Observer;

public class Customer {
    private String name; 


    public Customer(String name){
        this.name = name;  
        Admin.add(this); 
    }

    public void notified(){
        System.out.println(name + " telah dinotify!"); 
    }

}
