package java200601;

public abstract class Book {
	private int number; // 관리번호
	private String title; // 책제목
	private String author; // 저자
	private static int countOfBooks; // book개체 
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int lastDays);
	
	@Override
	public boolean equals(Object obj) {
		if(((Book)obj).getTitle().equals(title)&&((Book)obj).getAuthor().equals(author)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "관리번호"+(getNumber()+1)+"번, 제목: "+title+", 작가: "+author
				+"(일주일 연체료: "+String.format("%,d",getLateFee(7))+"원)";
	}
}





















