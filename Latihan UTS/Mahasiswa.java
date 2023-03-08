public abstract class Mahasiswa implements Human{
    //private = cuma bisa diakses dalam class ini aja
    private String nama; 
    private String jurusan;
    private boolean status; 
    private static int jumlah_mahasiswa; 

    public Mahasiswa(String nama, String jurusan){
        this.nama = nama; 
        this.jurusan = jurusan; 
        status = true; 
        jumlah_mahasiswa++; 
    }

    public String getNama(){
        return nama; 
    }

    public String getJurusan(){
        return jurusan; 
    }

    public boolean getStatus(){
        return status; 
    }

    public static int getTotal(){
        return jumlah_mahasiswa; 
    }

    public void dropout(){
        status = false; 
    }

    public void dummy(){
        System.out.println("Oogah Boogah Super Dummy"); 
    }

    public void talk(){
        System.out.println("Halo halo!"); 
    }

    public int getUmur(){
        return default_umur; 
    }

    public String getPeran(){
        return jurusan; 
    }

    public boolean isTheSame(Human placeholder){
        return (jurusan.equals(placeholder.getPeran())); 
    }

    public abstract String toString(); 

}