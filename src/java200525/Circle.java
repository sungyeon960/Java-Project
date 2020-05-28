package java200525;

public class Circle {
	private double radius;
	private double x;
	private double y;
	
	public Circle() {}
	
	public double getRadius() {
		if(radius<0) {
			return 0;
		}
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}
	
}
