package java200525;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture=manufacture;
		this.model=model;
		this.maxNumberOfPassengers=maxNumberOfPassengers;
		numberOfPlanes++;
	}
	
	public String getManufacture() {
		return this.manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture=manufacture;
	}
	
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.manufacture=model;
	}
	
	public int getMaxNumberOfPassengers() {
		return this.maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers=maxNumberOfPassengers;
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
}























