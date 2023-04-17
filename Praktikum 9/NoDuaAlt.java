import java.util.*;

public class NoDuaAlt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String inp = sc.nextLine(); 

        List <Integer> l = new ArrayList<Integer>(); 

        String[] listInt = inp.split("\\s+"); 

        int i = 0; 
        if (inp.length() != 0){
            for (String x : listInt){ 
                l.add(Integer.parseInt(x)); 
            }    
        }
        System.out.println(l); 
    }
}
