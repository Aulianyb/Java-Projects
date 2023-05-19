import java.util.*; 

public class Main1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    int op = Integer.parseInt(sc.nextLine());

    TreeSet <Integer> tree = new TreeSet<Integer>(); 

    int temp; 

    for (int i=0;i<op;i++){
      String cmd = sc.next(); 
      switch (cmd){
        case "add":
          temp = Integer.parseInt(sc.next()); 
          tree.add(temp); 
          break; 
        case "remove": 
          temp = Integer.parseInt(sc.next());
          if (!tree.contains(temp)){
            System.out.println("Element " + temp + " is not in The TreeSet"); 
          }
          else{
            tree.remove(temp); 
          }
          break; 
        case "first": 
          if (tree.isEmpty()){
            System.out.println("EMPTY"); 
          }
          else{
            System.out.println(tree.first()); 
          }
          break; 
        case "last": 
          if (tree.isEmpty()){
            System.out.println("EMPTY"); 
          }
          else{
            System.out.println(tree.last()); 
          }
          break; 
      }
    }

  }
}