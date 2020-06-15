package java200608;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
	public static void main(String[] args) {
		System.out.println(Util.compare(10, 20));
		System.out.println(Util.compare(4.5, 3));
	}
}
