/**
 * Fespa.java
 * subclass Fespa
 * @author 18221066 Aulia Nadhirah Yasmin Badrulkamal
 */
public class Fespa extends Motor{
    private String color;
    private Boolean isRoundedFrontLamp;

    public Fespa(int numberOfWheels,int engineCapacity, String color, Boolean isRoundedFrontLamp) {
        //Konstruktor
        //color merupakan warna dari fespa
        //isRoundedFrontLamp merupakan bentuk dari lampu depan fespa. Apabila true maka bentuknya lingkaran dan apabila false maka bentuknya persegi panjang
        super(numberOfWheels, engineCapacity);
        this.color = color; 
        this.isRoundedFrontLamp = isRoundedFrontLamp; 
    }

    public String getColor(){
        //Mengembalikan teks berupa warna fespa
        return color; 
    }

    public Boolean getLampRoundedShape(){
        //Mengembalikan status kebenaran dari apakah bentuk lampu depan fespa lingkaran
        return isRoundedFrontLamp; 
    }
    
    public String sound(){
        //Mengembalikan string berisi "Trototong"
        return "Trototong"; 
    }

    public String printDescription(){
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isRoundedFrontLamp true, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki warna c, dan memiliki lampu depan berbentuk lingkaran" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah color
        //Apabila isRoundedFrontLamp false, maka mengembalikan: "Motor ini memiliki a roda dengan kapasitas mesin b cc, memiliki warna c, dan memiliki lampu depan berbentuk persegi panjang" dengan a adalah numberOfWheels, b adalah engineCapacity dan c adalah color
        if (isRoundedFrontLamp){
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki warna %s, dan memiliki lampu depan berbentuk lingkaran", this.getNumberOfWheels(), this.getEngineCapacity(), color);
        }
        else{
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki warna %s, dan memiliki lampu depan berbentuk persegi panjang", this.getNumberOfWheels(), this.getEngineCapacity(), color);
        }
    }
}