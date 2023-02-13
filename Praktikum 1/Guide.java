//cara compile : 
//javac namafile.java
//java namafile
public class Guide{
	public static void main (String[] args){
		Mahasiswa M_1 = new Mahasiswa("Aulia", "18221066", 23);
		Mahasiswa M_2 = new Mahasiswa("Gani", "18221100", 21); 
		Mahasiswa M_3 = new Mahasiswa("Fanni", "18221505", 21);

		System.out.println("Halo Nama saya " + M_1.getNama());   
		System.out.println("NIM saya " + M_1.getNim());
		System.out.println("Saya sedang mengambil " + M_1.getSks() + " SKS");
		System.out.println("Jumlah Mahasiswa : " + M_1.getJumlahMahasiswa());
		M_1.tambahSks(2);
		System.out.println("Menambah 2 sks : " + M_1.getSks());

		IPMahasiswa IP_1 = new IPMahasiswa(M_1, 3.40);
		System.out.println("IP Mahasiswa : " + IP_1.getIPK());
		System.out.println("Testing Mahasiswa : " + IP_1.getMahasiswa().getSks()); 
		IP_1.ubahIPK(100); 
		System.out.println("IP Mahasiswa : " + IP_1.getIPK());
		IP_1.ubahIPK(3.88); 
		System.out.println("IP Mahasiswa : " + IP_1.getIPK());
		System.out.println("Cumlaude Diff : " + IP_1.avgDiffToCumlaude());
	}
}