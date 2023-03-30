import java.util.Scanner; 

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in); 
    
        Calculator c = new Calculator(); 
    
        try{
            int a = Integer.parseInt(sc.nextLine()); 
            int b = Integer.parseInt(sc.nextLine()); 
            String op = sc.nextLine(); 
            System.out.println(c.calculate(a, b, op)); 
        } catch (InvalidOperationException e){
            System.out.println(e.getClass().getName() + "!" + e.getMessage()); 
        } catch (InvalidDivisionByZero e){
            System.out.println(e.getClass().getName() + "!" + e.getMessage()); 
        } catch (Exception e){
            System.out.println("Unknown Exception!"); 
        } finally {
            System.out.println("Calculated"); 
            sc.close();
        }
    }
}
