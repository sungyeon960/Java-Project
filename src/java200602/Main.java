package java200602;

import java200602.A.B;
import java200602.A.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		//new B();//안됨! b는 a안의 b
		B b = a.new B(); // a의 b를 찾는것
		//위의것들 없이
		// B b = new A().new B()라 써도됨!!
		// 잘 안쓰여
		b.field1 = 3;
		b.method1();
		
		// c는 static이기에 바로 생성 가능
		C c = new A.C(); // C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		// static이어서 이런식으로 가능~
		A.C.field2 = 3;
		A.C.method2();
	}
}
