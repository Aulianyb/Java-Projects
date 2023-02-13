import java.util.Scanner; 

//$ javac file.java
//$ java file

public class Not{
	public static void main (String[] args){
		Scanner scanline = new Scanner(System.in); 

		String s = scanline.nextLine();
		int x = scanline.nextInt(); 
		float f = scanline.nextFloat(); 
		boolean b = scanline.nextBoolean();

		if (b){
			System.out.println(s + " " + x + " " + f); 
		} 

	}
}