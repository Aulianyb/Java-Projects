
public class Elang extends Animal{
	private long basePower; 
	private int jumlahTelur; 

	public Elang(long basePower){
		super(2);
		this.basePower = basePower; 
		jumlahTelur = 0; 
	}	

	public int getJumlahTelur(){
		return jumlahTelur; 
	}

	public void bertelur(){
		jumlahTelur += 1; 
	}

	public long getAnimalPower(){
		return basePower * this.getNumberofChildren() - jumlahTelur; 
	}
}