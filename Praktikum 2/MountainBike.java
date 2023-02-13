
public class MountainBike extends Bicycle{
	public int seatHeight;

	//konstruktor
	public MountainBike(int StartHeight, int gigi){
		super(gigi); 
		// this calls the constructor of the superclass
		seatHeight = StartHeight; 
	}

	public void test(){
		super.test();
		System.out.println("gigi : " + getGigi());
		System.out.println("seatHeight : " + seatHeight);
	}

	public static void main(String[] args){
		MountainBike B = new MountainBike(10, 20);
		B.test(); 
	}
}