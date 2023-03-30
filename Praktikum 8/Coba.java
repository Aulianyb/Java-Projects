public class Coba extends Thread {
    public void run(){
        System.out.println("AHOY");
    }

    public static void main(String args[]){
        (new Coba()).start();
    }
}
