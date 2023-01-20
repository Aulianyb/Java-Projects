import java.util.Scanner; // untuk pakai scanner

/* Nama class = Nama file*/
/* ya, berarti kalau ada kelas baru maka ada file baru */
public class Hackerrank{
    /* apapun yang ditulis disini adalah class attributes */
    int x = 5; 
    int y = 10; 
    final int z = 20; 
    /* final artinya tidak bisa diganti samsek */

    /* public vs static
     * public = hanya bisa diakses lewat objek (fungsi)
     * static = bisa diakses tanpa objek (procedure)
     */

    static void test1(){
        System.out.println("Thats poggers");
    }

    public void test2(String name){
        System.out.println("Very Epic " + name);
    }

    public Hackerrank(int a, int b, int c){
        x = a;
        y = b; 
    }

    public static void main(String[] args){
        /* dibawah ini adalah objects */
        Hackerrank myObj = new Hackerrank(1, 2, 3);
        Hackerrank testi = new Hackerrank(4, 5, 6);

        /* ubah atribut */
        myObj.y = 12; 

        /* ini cara akses objek */
        System.out.println(myObj.y);
        System.out.println(testi.x);

        /* public vs static */
        test1();
        myObj.test2("Whiskey");

        /* user input */
        Scanner scanline = new Scanner(System.in);
        
        System.out.println("Where do you live?");
        String nation = scanline.nextLine();
        System.out.println("You live in " + nation);

    }
}