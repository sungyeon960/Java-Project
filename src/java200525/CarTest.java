package java200525;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("red");
		System.out.println(myCar.getColor());
		System.out.println(Car.getMaxSpeed());

		if (myCar.speedUp(200.0)) {
			System.out.println("가능");
		} else {
			System.out.println("불가능");
		}
		System.out.println(myCar.getSpeed());
		System.out.println();
		if (myCar.speedUp(150.0)) {
			System.out.println("가능");
		} else {
			System.out.println("불가능");
		}
		System.out.println(myCar.getSpeed());

		Car yourCar = new Car("blue");
		System.out.println();
		System.out.println(yourCar.getColor());
		System.out.println(Car.getMaxSpeed());

		System.out.println();
		NewCar car = new NewCar();
		System.out.println(car.killoToMile(1.0));
	}
}
