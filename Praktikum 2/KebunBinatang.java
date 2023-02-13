import java.util.Scanner; 


public class KebunBinatang{
	public static void main(String[] args){
		Scanner scanline = new Scanner(System.in);

		int choice = scanline.nextInt();
		long child = scanline.nextInt(); 

		if (choice == 1){
			Elang el = new Elang(5);
			int egg = scanline.nextInt();

			el.increaseChild(child);
			for (int i=0;i<egg;i++){
				el.bertelur(); 
			}

			System.out.println(el.toString());
			System.out.println("Jumlah Telur : " + el.getJumlahTelur());
			System.out.println("Animal Power : " + el.getAnimalPower());

		}
		else if (choice == 2){
			long gading = scanline.nextInt();
			Gajah gjh = new Gajah(10, gading);
			gjh.increaseChild(child);
			System.out.println(gjh.toString());
			System.out.println("Jumlah Gading : " + gjh.getJumlahGading());
			System.out.println("Animal Power : " + gjh.getAnimalPower());
		} 
		else if (choice == 3){
			boolean kawan = scanline.nextBoolean();
			Serigala srg = new Serigala(10, kawan);
			srg.increaseChild(child); 
			System.out.println(srg.toString());
			
			if (srg.hasKawanan()){
				System.out.println("Serigala berada di dalam kawanan");
			}
			else{
				System.out.println("Serigala tidak berada di dalam kawanan");
			}

			System.out.println("Animal Power : " + srg.getAnimalPower());
		}
	}
}