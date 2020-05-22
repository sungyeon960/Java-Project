package java200522;

public class ShopServiceEx {
	private static ShopServiceEx instance = new ShopServiceEx();
	private ShopServiceEx() {
			
	}
	public static ShopServiceEx getInstance() {
		return instance;
	}
}


