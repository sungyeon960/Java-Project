package java200608;

// 제네릭 t는 필드값!!
public class Box<T> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	/*
	 * // 메소드 사용 T public static <T> Box<T> boxing(T t){ Box<T> box = new Box<>();
	 * box.setObject(t); return box; }
	 */
	// 메소드 사용 B
	public static <B> Box<B> boxing(B t) {
		Box<B> box = new Box<>();
		box.setObject(t);
		return box;
	}
}
