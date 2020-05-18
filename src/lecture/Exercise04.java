package lecture;

public class Exercise04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerSudent = pencils/students;
		System.out.println(pencilsPerSudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
	}

}
