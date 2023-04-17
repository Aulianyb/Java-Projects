import java.util.*;

public class NoSatu{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idx = Integer.parseInt(sc.nextLine());
    Deque<Integer> deque = new ArrayDeque<Integer>();  
    boolean isReversed = false; 
    for (int i=0;i<idx;i++){
        String op = sc.next();
        int x; 
        switch (op){
            case "addFirst":
                x = Integer.parseInt(sc.next()); 
                if (isReversed){
                    deque.addLast(x); 
                }else{
                    deque.addFirst(x);                     
                }
                break; 
            case "addLast":
                x = Integer.parseInt(sc.next()); 
                if (isReversed){
                    deque.addFirst(x); 
                }else{
                    deque.addLast(x); 
                }
                break; 
            case "pollFirst":
                if (deque.isEmpty()){
                    System.out.println("EMPTY"); 
                }
                else{
                    if (isReversed){
                        System.out.println(deque.pollLast()); 
                    }else{
                        System.out.println(deque.pollFirst()); 
                    }
                }
                break; 
            case "pollLast":
                if (deque.isEmpty()){
                    System.out.println("EMPTY"); 
                }
                else{
                    if (isReversed){
                        System.out.println(deque.pollFirst()); 
                    }else{
                        System.out.println(deque.pollLast()); 
                    }
                }
                break; 
            case "reverse":
                isReversed = !isReversed; 
                break;  
            }
        }
   } 
}