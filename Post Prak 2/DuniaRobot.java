/**
 * DuniaRobot.java
 * File Driver
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */

import java.util.Scanner; 


public class DuniaRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt(); 


        if (choice == 1){
            //PROSES
            int parts = sc.nextInt(); 
            int totalTrans = sc.nextInt(); 
            boolean active = sc.nextBoolean(); 

            Bumblebee bb = new Bumblebee(parts, active);
            for (int i=0;i<totalTrans;i++){
                bb.addTransformation(); 
            }

            //OUTPUT
            System.out.println(bb.toString());
            System.out.println("Jumlah transformasi: " + bb.getTotalTransformation()); 
            System.out.println("Harga robot: " + bb.getPrice());  
        }
        else if (choice == 2){
            //INPUT
            long prc = sc.nextLong(); 
            int totalM = sc.nextInt(); 

            Sirik ss = new Sirik(prc); 
            for (int i=0;i<totalM;i++){
                ss.addModel(); 
            }

            //OUTPUT
            System.out.println(ss.toString());
            System.out.println("Jumlah model: " + ss.getTotalModel()); 
            System.out.println("Harga robot: " + ss.getPrice()); 
        }
        else if (choice == 3){
            //INPUT
            int mile = sc.nextInt(); 
            boolean active = sc.nextBoolean();

            WallE ww = new WallE(mile, active); 

            //OUTPUT
            System.out.println(ww.toString());
            System.out.println("Jumlah mileage: " + ww.getMileage()); 
            System.out.println("Harga robot: " + ww.getPrice()); 

        }

    }
}
