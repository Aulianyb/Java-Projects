import javax.crypto.Cipher;

public class test{

    public boolean isUpperLetter(char c){
        int x = (int) c; 
        return (65 <= x) && (x <= 90); 
    }

    public boolean isLowerLetter(char c){
        int x = (int) c; 
        return (97 <= x) && (x <= 122); 
    }

    public String cipher(String input, int shift){
        String result=""; 
        char x; 
        for (int i = 0; i < input.length(); i++){
            x = input.charAt(i); 
            if (this.isUpperLetter(x)){
                if ((int) x + shift > 90){
                    x = (char)(((int) x + shift) % 90 + 64); 
                }
                else{
                    x = (char) ((int) x + shift); 
                }
            }
            else if(this.isLowerLetter(x)){
                if ((int) x + shift > 122){
                    x = (char)(((int) x + shift) % 122 + 96); 
                }
                else{
                    x = (char) ((int) x + shift); 
                }
            }
            result += x;   
        }
        return result; 
    } 

    public void dd(char x, int shift){
        int a; 
        if ((int) x + shift > 122){
            a = (((int) x + shift) % 122 + 97); 
        }
        else{
            a = ((int) x + shift); 
        }

        System.out.println(a);
    }

    public static void main(String[] args){
        Boolean a = true; 
        Character b = '&'; 
        Integer c = 123; 
        Double d = 3.14; 
        String e = "MASKIE"; 

        test t = new test(); 

        System.out.println(t.cipher("ZZYYXX", 10)); 
    }
}