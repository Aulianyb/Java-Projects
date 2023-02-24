import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length()); 
        if (A.length() < B.length()){
            System.out.println("Yes"); 
        }
        else{
            System.out.println("No");
        }
        
        String S1 = A.substring(0, 1).toUpperCase(); 
        String S2 = A.substring(1, A.length());
        String S3 = B.substring(0, 1).toUpperCase(); 
        String S4 = B.substring(1, B.length());  
        String res = S1 + S2 + " " + S3 + S4;       
        System.out.println(res); 
    }
}
