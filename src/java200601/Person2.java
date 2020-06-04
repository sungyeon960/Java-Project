package java200601;
import kim.chopper.MyArrays;


public class Person2 implements Comparable <Person2>{
	private String name;
	private double height;
	
	public Person2() {
		
	}
	public Person2(String name, double height) {
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
	
	
	
	public static String getTallest1(Person2[] people) {
		return people[MyArrays.getMaximum(people)].getName();
	}
	
	@Override
	public int compareTo(Person2 o) {
		if(getHeight()>o.getHeight()) {
			return 1;
		}else if(getHeight()<o.getHeight()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	public String toString() {
		return "이름: "+getName()+", 키: "+getHeight();
	}
}
