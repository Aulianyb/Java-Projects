import java.util.*;
import java.lang.reflect.Method;

class GetMethod {
    public static void main(String[] args) {
        Class c = ArrayList.class;
        Method m[] = c.getMethods();
        for (Method e: m) {
            System.out.println(e.getName());
        }
    }
}