package java200601;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		//원 넓이 파이알제곱
		return Math.PI*radius*radius;
	}
	@Override
	public double perimeter() {
		//원 둘레 이파이알
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "도형의 종류: 원, 둘레: "
				+"%.2f㎝"+perimeter()+
				", 넓이: %.2f㎠"+ area(); 
	}
}
