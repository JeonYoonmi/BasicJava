package g_opp2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	//객체를 생성하면 주소를 저장, 출력하면 주소가 나온다.
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour < 0) {
			this.hour = 0;
		}else if(hour > 23) {
//			this.hour = 23;
			this.hour = hour % 24;
		}else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0) {
			this.minute = 0;
		}else if(minute > 59) {
//			this.minute = 59;
			this.minute = minute % 60;
			setHour(this.hour + minute / 60);
//			setHour(hour + 1);
		}else {		
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0) {
			this.second = 0;
		}else if(second > 59) {
//			this.second = 59;
			this.second = second % 60;
			setMinute(this.minute + second / 60);
//			setMinute(minute + 1);
			//minute++로 하면 이미 1이 증가한 상태로 넘어가기 때문에 minute에 60을 넣을지 말지를 고민하는 것이 아니라
			//이미 넣고 바꿀지 말지를 고민하게 된다.
		}else {		
			this.second = second;
		}
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	//매서들을 이용해서 변수들에 간접적으로 접근
	//set으로 넘어오는 값을 조건을 걸어서 올바른 값일 때만 저장하게 할 수 있다
	
	//시간이 1초 흐를 때마다 잠간동안 머춤
	void clock() {
		while(true){
			System.out.println(toString());
			stop();
			setSecond(second + 1);
		}
	}
	
	private void stop() { //stop 매서드는 다른 클래스에서 볼 필요가 없으므로 private
		try {
			Thread.sleep(100); //잠깐동안 멈추는 클래스 tread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
