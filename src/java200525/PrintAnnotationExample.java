package java200525;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// 눈에 보이지 않는데 이를 볼 수 있게 해줌
		Method[] methods = Service.class.getDeclaredMethods();
		for (Method method : methods) {
			PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);
			// true이면, annotation이 붙어있으면 true
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				System.out.println("["+method.getName()+"]");
				// 구분선 출력
				for (int i = 0; i < annotation.number(); i++) {
					// 0부터 
					// val이 - num 15
					// val이 * num 15
					// val이 # num 20
					System.out.print(annotation.value());
				}
				System.out.println();
				
				// 메소드 호출
				try {
					method.invoke(new Service());
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
