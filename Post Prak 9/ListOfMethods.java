import java.lang.reflect.*;
import java.util.*; 


public class ListOfMethods {
    public static void main(String[] args){
        Class<?> c = String.class; 
        Method[] methodList = c.getMethods(); 
        for (Method m : methodList){
            System.out.println(m.getName());
        }
    }
}
