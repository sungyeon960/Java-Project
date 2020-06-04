package java200601;

public class ScienceFiction extends Book {
	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lastDays) {
		return lastDays*=600;
	}

}

