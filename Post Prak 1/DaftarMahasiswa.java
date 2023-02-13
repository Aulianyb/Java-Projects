import java.util.Scanner; 

public class DaftarMahasiswa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 

		String _name = sc.nextLine(); 
		String _nim = sc.nextLine();
		int _sks = sc.nextInt();
		int _tambah = sc.nextInt();

		Mahasiswa M = new Mahasiswa(_name, _nim, _sks); 

		System.out.println("Nama mahasiswa: " + M.getNama());
		System.out.println("NIM mahasiswa: " + M.getNim());
		System.out.println("SKS mahasiswa: " + M.getSks());
		System.out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());

		M.tambahSks(_tambah);
		System.out.println("Total Revisi SKS mahasiswa: " + M.getSks());
	}
}