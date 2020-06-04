package java200601;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		return Math.sqrt(3)*side*side*0.25;
	}
	@Override
	public double perimeter() {
		return side*3;
	}
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: "
				+"%.2f㎝"+perimeter()+
				", 넓이: %.2f㎠"+ area(); 
	}
}
