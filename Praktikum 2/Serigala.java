
public class Serigala extends Animal{
	private long basePower; 
	private boolean kawanan;

	public Serigala(long basePower, boolean kawanan){
		super(4);
		this.basePower = basePower; 
		this.kawanan = kawanan;  
	}

	public boolean hasKawanan(){
		return kawanan; 
	}

	public long getAnimalPower(){
		if (this.hasKawanan()){
			if (this.getNumberofChildren() == 0){
				return basePower; 
			}
			else{
				return basePower * 3 * this.getNumberofChildren();
			}
		}
		else{
			return basePower; 
		}
	}
}