package java200529;

public interface RemoteControl {
	int MAX_VOLUM = 10;
	int MIN_VOLUM =0;
	
	void turnOn();
	void turnOff();
	void setVolum(int volume);
	
	default void setMuto(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}else{
			System.out.println("무음해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
