import java.util.*; 

public class Main {
    public static void main(String[] args){
        String[] list = {"John", "Annisa", "Elaise"}; 
        System.out.println(Arrays.toString(list)); 

        Set<String> people; 

        people = new HashSet<String>(); 
        for (String elt:list) people.add(elt); 
        System.out.println(people);

        for (String person:people)
            System.out.println(person);
        
        people = new LinkedHashSet<String>(); 
        for (String elt: list) people.add(elt); 
        System.out.println(people);

        people = new TreeSet<String>();
        for (String elt : list) people.add(elt); 
            System.out.println(people);
    } 

}
