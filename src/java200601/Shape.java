package java200601;

public abstract class Shape implements Comparable<Shape>{
	public abstract double area();
	public abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		if(area()>o.area()) { // o.area는 비교대상. 
			return 1;
		}else if(area()<o.area()) {
			return -1;
		}else {
			return 0;
		}
	}
}


