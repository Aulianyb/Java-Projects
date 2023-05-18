package Adapter;

public class Adapter implements PrinterString{
    private PrinterInt pi; 

    public Adapter(){
        pi = new PrinterInt(); 
    }

    public void printerString(String string){
        //disini diubah jadi int, itu adapternya
        int x = Integer.valueOf(string); 
        pi.printerInt(x);
    }
}
