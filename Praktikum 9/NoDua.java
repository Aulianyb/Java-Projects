import java.util.*;

public class NoDua{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String inp = sc.nextLine(); 

        List <Integer> l = new ArrayList<Integer>(); 

        String currentInt = ""; 

        int i = 0; 
        while (i < inp.length()){
            char currentChar= inp.charAt(i);
            if (currentChar != ' '){
                currentInt += currentChar;
            }
            else{
                if (!currentInt.equals("")){
                    l.add(Integer.parseInt(currentInt)); 
                }
                currentInt = ""; 
            }
            i++; 
        }

        if (!currentInt.equals("")){
            l.add(Integer.parseInt(currentInt)); 
        }
        System.out.println(l); 
    }
}
