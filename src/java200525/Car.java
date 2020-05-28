package java200525;

public class Car {
	private double speed;
	private String color;
	private final static double MAX_SPEED=200;

	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return this.color;
	} 
	public boolean speedUp(double speed) {
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
		return Car.MAX_SPEED;
	}

}
