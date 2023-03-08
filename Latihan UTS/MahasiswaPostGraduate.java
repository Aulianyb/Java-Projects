public class MahasiswaPostGraduate extends Mahasiswa {
    private String judulThesis; 

    public MahasiswaPostGraduate(String nama, String jurusan, String judulThesis){
        super(nama, jurusan); 
        this.judulThesis = judulThesis; 
    }

    public String toString(){
        return "Halo, nama saya " + this.getNama() + " dan saya mahasiswa Post Graduate yang mengerjakan thesis berjudul " + judulThesis; 
    }
}
