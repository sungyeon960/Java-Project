package java200601;
import kim.chopper.MyArrays;


public class Person implements Comparable <Person>{
	private String name;
	private double height;
	
	public Person() {
		
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
//	public static String getTallest(Person[] people) {
//		Arrays.sort(people);
//		return people[people.length-1].getName();
//	}
	
	
	
	public static String getTallest2(Person[] people) {
		return people[MyArrays.getMaximum(people)].getName();
	}
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}
	
	
	public String toString() {
		return "이름: "+getName()+", 키: "+getHeight();
	}
}
