import java.util.*;

public class Driver {
    public static void main(String[] args){
        MahasiswaS1 M1 = new MahasiswaS1("Nayla"); 
        MahasiswaS1 M2 = new MahasiswaS1("Visier", "Informatika", 2); 
        MahasiswaPostGraduate M3 = new MahasiswaPostGraduate("Audrey", "Informatika", "OOChem"); 

        NPC n1 = new NPC("Saloon"); 
        NPC n2 = new NPC("Shopkeeper"); 

        System.out.println(M1.toString()); 
        System.out.println(M2.toString()); 
        System.out.println(M3.toString()); 

        System.out.println("Saat ini jumlah mahasiswa adalah : " + Mahasiswa.getTotal()); 
        M1.dummy(); 
        M1.talk(); 
        System.out.println(n1.isTheSame(n2));
        System.out.println(M3.isTheSame(M2)); 
        NPC.samesies(n1, n2); 
        n1.walk(); 

        NPC n3 = new Warrior(); 
        NPC n4 = new Alchemist("Oxygen"); 

        
        NPC[] npcList = {n1, n2, n3, n4}; 
        for (int i=0;i<4;i++){
            System.out.println(npcList[i].toString()); 
        }
    }
}
