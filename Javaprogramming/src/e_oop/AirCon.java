package e_oop;

public class AirCon {
	
	boolean power = false;
		int temperature = 24;
		int wind = 2;
		
		final int MIN_TEMPERATURE = 18;
		final int MAX_TEMPERATURE = 30;
		final int MIN_WIND = 1;
		final int MAX_WIND = 3;
		
		void power() {
			power = !power;
			System.out.println(power ? "에어컨 켜짐" : "에어컨 꺼짐");
		}
		
		void temperatureUp() {
			if(power) {
				if(temperature < MAX_TEMPERATURE) {
					temperature++;
				}
				System.out.println("온도. " + temperature);
			}
		}
		
		void temperatureDown() {
			if(power) {
				if(MIN_TEMPERATURE < temperature) {
					temperature--;
				}
				System.out.println("온도. " + temperature);
			}
		}
		
		void changeWind() {
			if(power) {
				wind++;
				if(MAX_WIND < wind) {
					wind = MIN_WIND;
				}
				System.out.println("바람세기. " + wind);
			}
		}
		
		public static void main(String[] args) {
			AirCon ac = new AirCon();
			
			while(true) {
				System.out.print("1.전원  2.온도+  3.온도-  4.바람세기  0.종료>");
				int input = ScanUtil.nextInt();
				
				switch (input) {
				case 1:
					ac.power();
					break;
				case 2:
					ac.temperatureUp();
					break;
				case 3:
					ac.temperatureDown();
					break;
				case 4:
					ac.changeWind();
					break;
				case 0:
					System.out.println("종료되었습니다.");
					System.exit(0);
				}
			}
		}
		
	}
	
//	//에어콘 전원
//	boolean power = false;
//	//에어콘 온도조절
//	int temperature = 18;
//	//에어콘 풍량
//	int air = 1;
//	//에어콘 좌우바람
//	
//	//에어콘 상하바람
//	
//	
//	final int MIN_TEMPERATURE = 16;
//	final int MAX_TEMPERATURE = 30;
//	final int MIN_AIR = 1;
//	final int MAX_AIR = 4;
//	
//	//전원 오프
//	void power() {
//		power = !power;
//		System.out.println(power ? "에어콘 켜짐" : "에어콘 꺼짐");
//	}
//	
//	//에어콘 온도 올림
//	void temperatureUp() {
//		if(power) {
//			if(temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE) {
//				this.temperature++;
//				System.out.println("온도. " + temperature);
//			}
//			
//		}
//	}
//	
//	//에어콘 온도 내림
//	void temperatureDown() {
//		if(power) {
//			if(temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE) {
//				this.temperature--;
//				System.out.println("온도. " + temperature);
//			}
//		}
//	}
//	
//	//에어콘 풍량 올림
//	void air() {
//		if (power) {
//			if (air < MIN_AIR || air >= MIN_AIR) {
//				this.air++;
//			}
//			if (air > MAX_AIR) {
//				this.air = 1;
//			}
//		}
////		System.out.println("풍량. " + air);
//		showAir();
//	}
//	
//	//에어콘 풍량 보여줌
//	void showAir() {
//		for (int i = MIN_AIR; i <= MAX_AIR; i++) {
//			if (i <= air) {
//				System.out.println("●");
//			}
//			else {
//				System.out.println("○");
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		AirCon ac = new AirCon();
//		
//		while(true) {
//			System.out.println("1.전원  2.온도올림  3.온도내림  4.풍량조절  0.종료");
//			int input = ScanUtil.nextInt();
//			switch(input){
//			case 1:
//				ac.power();
//				break;
//			case 2:
//				ac.temperatureUp();
//				break;
//			case 3:
//				ac.temperatureDown();
//				break;
//			case 4:
//				ac.air();
//				break;
//			case 0:
//				System.out.println("종료되었습니다.");
//				System.exit(0);
//			}
//		}
//		
//	}

