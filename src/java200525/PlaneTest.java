package java200525;

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("보잉","보잉 747", 450);
		System.out.println(plane1.getManufacture());
		System.out.println(plane1.getModel());
		System.out.println(plane1.getMaxNumberOfPassengers());
		
		Plane plane2 = new Plane("보잉","보잉 747", 450);
		System.out.println(plane2.getManufacture());
		System.out.println(plane2.getModel());
		System.out.println(plane2.getMaxNumberOfPassengers());
		Plane plane3 = new Plane("보잉","보잉 747", 450);
		System.out.println(plane3.getManufacture());
		System.out.println(plane3.getModel());
		System.out.println(plane3.getMaxNumberOfPassengers());
		
		System.out.println(Plane.getNumberOfPlanes());
	}
}
