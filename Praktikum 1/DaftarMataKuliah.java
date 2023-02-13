import java.util.Scanner;

public class DaftarMataKuliah{
	public static void main (String[] args){
		Scanner scanline = new Scanner(System.in);
		String code = scanline.nextLine();
		String name = scanline.nextLine();
		int s = scanline.nextInt();
		scanline.nextLine();
		String d = scanline.nextLine();
		int k = scanline.nextInt();
		int x = scanline.nextInt();

		MataKuliah M = new MataKuliah(code, name, s, d, k);

		System.out.println("Kode Mata Kuliah: " + M.getKode());
		System.out.println("Nama Mata Kuliah: " + M.getNama());
		System.out.println("SKS Mata Kuliah: " + M.getSks());
		System.out.println("Nama Dosen: " + M.getDosen());
		System.out.println("Kapasitas Kuliah: " + M.getKapasitas());

		M.tambahKapasitas(x);
		System.out.println("Total Revisi Kapasitas Kuliah: " + M.getKapasitas());
	}
}