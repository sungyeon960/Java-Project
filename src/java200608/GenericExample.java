package java200608;

public class GenericExample {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setObject(100);
		// System.out.println(box.getObject());//100 박싱해서
		// int num = (int) box.getObject();
		//box.setObject("홍길동");//string이어서 오류
		box.setObject(314);
		//String name = (String) box.getObject();
		int value = box.getObject();
		
		
		// 들어 갈 데이터 자동타입체킹
		Boxes<String> boxes = new Boxes<String>(5);
		// 앞에 데이터형을 알려주면 뒤에 굳이 알려 줄 필요 없음!!
		//Boxes<String> boxes = new Boxes<>(5); // oo!
		boxes.addObject("홍길동");
		//boxes.addObject(100);
		//boxes.addObject(3.14);
		//boxes.addObject(true);
		//boxes.addObject(new Box()); // object니 객체도 들어 갈 수 있음
		for (Object obj : boxes.getObjects()) {
			if (obj instanceof String) {
				//String name1 = (String) obj + "님";
				String name1 = obj + "님";
				System.out.println(name1);
			}
		}
	}
}
