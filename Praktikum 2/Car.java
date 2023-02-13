public abstract class Car {
	private int numberOfWheels; 
	private long mileage;

	public Car(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels; 
		this.mileage = 0; 
	}	

	public int getNumberOfWheels(){
		return numberOfWheels; 
	}

	public long getMileage(){
		return mileage; 
	}

	public void increaseMileage(long increment){
		mileage += increment; 
	}

	public String toString(){
		return String.format("Number of Wheels : %d, Mileage : %d", numberOfWheels, mileage); 
	}

	public abstract long getPrice();
}