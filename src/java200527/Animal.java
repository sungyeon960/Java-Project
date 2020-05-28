package java200527;

public abstract class Animal {
	String kind;//필드
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound() ;
}
