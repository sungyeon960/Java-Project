package java200601;

public class Novel extends Book{
	public Novel (String title, String author) {
		super(title, author);
	}
	public int getLateFee(int lastDays) {
		return lastDays*=300;
	}
}
