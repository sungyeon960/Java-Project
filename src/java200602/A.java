package java200602;

public class A {
	String name;
	public A() {
		
	}
	class B{
		public B() { // 값 전달 시 편리.
			System.out.println(name);
			name = "홍길동";
		}
		int field1;
		void method1() {}
	}
	static class C{
		public C() {
			
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		class D{
			public D() {
				
			}
			int field1;
			void method1() {}
		}
			D d = new D();
			d.field1 = 3;
			d.method1();
	}
}
