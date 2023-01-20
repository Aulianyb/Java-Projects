public class App {

    static void sayHello(){
        System.out.println("Hello There!");
    }

    static int plus(int x, int y){
        return x + y; 
    }

    static String plus(String x, String y){
        return x + ' ' + y; 
    }
    /* overloading : beberapa method bisa beda type inputnya */

    public static void main(String[] args) throws Exception {
        /* Ini isinya aku coba coba aja */
        for (int i=0;i<2;i++){
            sayHello();
        }
        System.out.println(plus("me", "ur mom"));
    }
}
