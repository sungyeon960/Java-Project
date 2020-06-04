package java200601;

public class Poet extends Book{
	public Poet(String title, String author) {
		super(title, author);
	}
	@Override
	public int getLateFee(int lastDays) {
		return lastDays*=200;
	}
}
