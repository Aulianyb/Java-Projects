public class CasioGraph implements GraphCalculator{
	private Point point;
	private int batteryLevel;
	private boolean status; 

	public CasioGraph(int x, int y){
		status = false; 
		batteryLevel = 100; 
		Point p = new Point(x, y); 
		this.point = p; 
	}

	public int add(int a, int b){
		if (this.getStatus()){
			batteryLevel -= 10; 
			return a + b; 
		}
		else{
			return -1; 
		}
	}

	public int substract(int a, int b){
		if (this.getStatus()){
			batteryLevel -= 10; 
			return a - b; 
		}
		else{
			return -1; 
		}
	}

	public int multiply(int a, int b){
		if (this.getStatus()){
			batteryLevel -= 10; 
			return a * b; 
		}
		else{
			return -1; 
		}	
	}

	public double divide(int a, int b){
		if (this.getStatus()){
			batteryLevel -= 10; 
			return a / b; 
		}
		else{
			return -1; 
		}
	}

	public void start(){
		if (batteryLevel <= 0){
			status = false; 
		}
		else{
			status = true; 
		}
	}

	public void stop(){
		status = false; 
	}

	public int checkBattery(){
		if (batteryLevel <= 0){
			status = false; 
		}
		return batteryLevel; 
	}

	public void shiftX(int shiftCount){
		if (this.getStatus()){
			batteryLevel -= 10; 
			int x = point.getX();
			point.setX(x + shiftCount);
		}
	}

	public void shiftY(int shiftCount){
		if (this.getStatus()){
			batteryLevel -= 10; 
			int y = point.getY();
			point.setY(y + shiftCount);
		}
	}

	public double distance(int x, int y){
		if (this.getStatus()){
			batteryLevel -= 10; 
			return Math.sqrt(Math.pow(point.getX() - x, 2) + (Math.pow(point.getY() - y, 2)));
		}
		else{
			return -1; 
		}
	}

	public boolean getStatus(){
		return status;
	}

	public Point getPoint(){
		return point;
	}

	public void charge(){
		batteryLevel = 100; 
		status = true; 
	}

}