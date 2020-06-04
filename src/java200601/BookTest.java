package java200601;

public class BookTest {
	public static void main(String[] args) {
		System.out.println("<소장>");
		Book[] books = new Book[6];
		books[0] = new Novel("칼의 노래", "김훈");
		books[1] = new Novel("칼의 노래", "김훈");
		books[2] = new Poet("이상항", "이상");
		books[3] = new Poet("하늘바람별시", "윤동주");
		books[4] = new ScienceFiction("유년기", "아서");
		books[5] = new ScienceFiction("스페이스", "아서");
		
		for(Book b : books) {
			System.out.println(b);
		}
		System.out.println("1과 2책 같아?"+books[0].equals(books[1]));
	}
}
