package java200525;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(7.0);
		circle1.setX(0.0);
		circle1.setY(1.5);
		
		System.out.printf("%.2f",circle1.getArea());
	}
}
