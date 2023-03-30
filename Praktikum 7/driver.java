import java.util.InputMismatchException;
import java.util.Scanner;

public class driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
    
            System.out.println("Hasil = " + (a / b)); 
        } catch(ArithmeticException e){
            System.out.println("Oopsie");
        } catch(InputMismatchException e){
            System.out.println("uh ohhh stinky"); 
        } finally{
            System.out.println("YAY!"); 
            sc.close(); 
        }
       
    }
}