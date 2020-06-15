package java200610;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(capacity, manufacture, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Phone)) {
			return false;
		}
		Phone other = (Phone) obj;
		return capacity == other.capacity && Objects.equals(manufacture, other.manufacture)
				&& Objects.equals(model, other.model);
	}
}
