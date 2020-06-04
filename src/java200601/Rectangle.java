package java200601;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return width*height;
	}
	@Override
	public double perimeter() {
		return 2*(height+width);
	}
	public String toString() {
		return "도형의 종류: 사각형, 둘레: "
				+"%.2f㎝"+perimeter()+
				", 넓이: %.2f㎠"+ area(); 
	}
}
