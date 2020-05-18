package lecture;

public class ex22 {

	public static void main(String[] args) {
		double distance = 40e12, speed = 300000, sec;
		sec=distance/speed;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 "+sec/(60.0*60.0*24.0*365.0)+"광년이다.");
	}

}