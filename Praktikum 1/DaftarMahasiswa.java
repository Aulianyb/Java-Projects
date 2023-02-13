import java.util.Scanner; 

public class DaftarMahasiswa{
	public static void main (String[] args){
		Scanner scanline = new Scanner(System.in);
		String name = scanline.nextLine(); 
		String nim = scanline.nextLine();
		int sks = scanline.nextInt(); 
		Mahasiswa M = new Mahasiswa(name, nim, sks);
		int x = scanline.nextInt(); 

		//output
		System.out.println("Nama mahasiswa: " + M.getNama());
		System.out.println("NIM mahasiswa: " + M.getNim()); 
		System.out.println("SKS mahasiswa: " + M.getSks()); 
		M.tambahSks(x);
		System.out.println("Jumlah mahasiswa: " + M.getJumlahMahasiswa()); 
		System.out.println("Total Revisi SKS mahasiswa: " + M.getSks()); 

	}
}