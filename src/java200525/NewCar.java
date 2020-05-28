package java200525;

public class NewCar {
	private double speed;
	private String color;
	private final static double MAX_SPEED=200;
	
	public NewCar() {
	}
	public NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {		
		speed=killoToMile(speed);
		return this.speed;
	}

	public void setSpeed(double speed) {		
		speed=killoToMile(speed);
		this.speed = speed;
	}

	public String getColor() {
		return this.color;
	}
	
	public boolean speedUp(double speed) {
		speed=killoToMile(speed);
		if(speed<=0||speed>MAX_SPEED) {
			return false;
		}else {
			this.speed=speed;
			return true;
		}
	}
	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return NewCar.MAX_SPEED;
	}
	public double killoToMile(double distance) {
		return distance/1.6;
	}
	public double MileToKillo(double distance) {
		return distance*1.6;
	}

}