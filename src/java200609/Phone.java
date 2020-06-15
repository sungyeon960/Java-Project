package java200609;

public class Phone {
	private String model;
	private int capacity;
	private String manufacture;

	public Phone(String model, int capacity, String manufacture) {
		super();
		this.model = model;
		this.capacity = capacity;
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", capacity=" + capacity + ", manufacture=" + manufacture + "]";
	}
}
