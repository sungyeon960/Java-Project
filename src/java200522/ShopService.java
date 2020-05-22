package java200522;

public class ShopService {
	// 2. 객체 생성 (ShopService타입의 변수 생성)
	// ShopService instance = new ShopService();
	// 3. 변수는 private
	// private ShopService instance = new ShopService();
	// 6. static으로 변경
	private static ShopService instance = new ShopService();
	// 1. 외부에서 접근하지 못하도록 만들어야 한다.(private)
	private ShopService() {
		
	}
	// 4. getter생성
	//public ShopService getInstance() {
	// 5. static - return instance오류. 따라서 instance도 static으로 변경해야
	public static ShopService getInstance() {
		return instance;
	}
}
