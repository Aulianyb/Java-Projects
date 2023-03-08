public class MahasiswaS1 extends Mahasiswa{
    private int tingkat; 

    public MahasiswaS1(String nama, String Jurusan, int tingkat){
        super(nama, Jurusan);
        this.tingkat = tingkat;  
    }

    public MahasiswaS1(String nama){
        super(nama, "TPB"); 
        this.tingkat = 1; 
    }

    public void dummy(){
        super.dummy(); 
        System.out.println("Oogah Boogah Sub Dummy"); 
    }

    public String toString(){
        if (!this.getStatus()){
            return "Mahasiswa ini sudah dropout"; 
        }
        else{
            if (this.getJurusan().equals("TPB")){
                return "Halo, nama saya " + this.getNama() + " dan saya mahasiswa TPB"; 
            }
            else{
                return "Halo, nama saya " + this.getNama() + " dan saya mahasiswa jurusan " + this.getJurusan() + " tingkat " + tingkat; 
            }
        }
    }
}
