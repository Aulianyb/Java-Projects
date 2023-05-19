import java.util.*; 

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine()); 
        TreeSet<Integer> ts = new TreeSet<Integer>(); 
        String command = ""; 
        Integer number = 0;  
        for (int i = 0; i<n;i++){
            command = sc.next();  
            // System.out.println(number);     
            if (command.equals("add")){
                number = Integer.valueOf(sc.next());
                ts.add(number); 
            } else if (command.equals("remove")){
                number = Integer.valueOf(sc.next());
                if (ts.contains(number)){
                    ts.remove(number); 
                } else{
                    System.out.println("Element " + number + " is not in The TreeSet");
                }
            } else if (command.equals("first")){
                if (ts.isEmpty()){
                    System.out.println("EMPTY"); 
                } else{
                    System.out.println(ts.first());
                }
            } else if (command.equals("last")){
                if (ts.isEmpty()){
                    System.out.println("EMPTY"); 
                } else{
                    System.out.println(ts.last());
                }
            }
        }       
    }
}