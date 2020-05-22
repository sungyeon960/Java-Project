package java200522;

public class NextCar {
	// 속도
	private int speed; // 필드
	private boolean stop;
	
	NextCar(int speed, boolean stop){
		this.speed = speed;
		this.stop = stop;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

