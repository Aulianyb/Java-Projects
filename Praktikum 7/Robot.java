/**
 * Jangan lupa tambahkan kata kunci untuk menghandle exception
 */ 
public class Robot {
    /**
     * Tambahkan atribut kelas disini
     */ 
    private int x; 
    private int y; 

    public Robot() {
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */ 
        x = 0; 
        y = 0; 
    }

    public void walk(int x, int y) throws MoreThanTenException {
        /**
         * Implementasi
         * Apabila hasil penambahan x atau y melebihi 10, dilempar sebuah exception
         * dengan pesan "Tidak bisa jalan". Atribut tidak ditambahkan pada kasus ini.
         * 
         * Apabila input valid, tambahkan nilai atribut dan print pesan
         * "Sedang berjalan menuju (x, y)"
         */ 
        try{
            int result = x + y; 
            if (result > 10){
                throw new MoreThanTenException(); 
            }
            else{
                System.out.println("Sedang berjalan menuju " + result);
            }
        }catch(MoreThanTenException e){
            System.out.println("Tidak bisa jalan");
        }
    }

    public void talk(String language) {
        /**
         * Implementasi
         * Apabila input bukan "Indonesia" atau "Inggris", lempar exception dengan pesan
         * "Tidak bisa berbicara dalam bahasa {language}"
         * 
         * Apabila input valid, print pesan "Sedang berbicara dalam bahasa {language}"
         */ 
    }

    public void receiveCommand(String command) {
        /**
         * Implementasi
         * Apabila input bukan "walk" atau "talk", lempar exception "Perintah {command} tidak dikenal"
         */ 
    }
}

class MoreThanTenException extends Exception {
    MoreThanTenException(String message){
        super(message); 
    }
}

