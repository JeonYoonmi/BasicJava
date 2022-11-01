package e_oop;

//과제1
public class TV {
	
	//변수 : 변경하는 것(채널, 전원, 볼륨)
	/*
	 * 메서드
	 * - 채널: 채널 올리는매서드, 채널 내리는 메서드, 특정 채널로 가는 메서드
	 * - 전원: 전원 연결하는 메서드
	 * - 볼륨 : 볼륨을 올리는 메서드, 볼륨을 내리는 메서드
	 */
	//전원
	boolean power = false;
	//채널
	int channel = 1;
	//음량
	int volume = 5;
	
	//상수: 프로그램 안에서 자주 사용되는 의미있는 값을 표현할 때 사용한다.
	//상수이름은 대문자로 사용한다.
	final int MIN_CHANNEL = 1; //final: 변수를 상수로 바꿔줌, 변수의 값이 바뀌지 않게 해준다.
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	
	//전원 온/오프
	void power() {
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
//	void power() {
//		power = !power;
//		if(power) {
//			System.out.println("전원이 켜졌습니다.");
//		}
//		else{
//			System.out.println("전원이 꺼졌습니다.");
//		}
//	}
	
	//특정 채널로 변경
	void changeChannel(int channel) {
		if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL) {
			this.channel = channel;
		}
		System.out.println("채널. " + this.channel);
	}
//	void specifiChannel(int channelNum) {
//		if(power) {
//			channel = channelNum;			
//			System.out.println("채널" + channel + "번");
//		}
//		if(!power) {
//			System.out.println("전원을 켜주세요");
//		}
//	}
	
	//채널 업
	void channelUP() {
		changeChannel(channel + 1);
	}
//	void channelUp() {
//		if(power) {
//			if(channel > 0) {
//				channel++;
//				System.out.println("채널" + channel + "번");
//			}
//		}
//		if(!power) {
//			System.out.println("전원을 켜주세요");
//		}
//	}
	
	//채널 다운
	void channelDown() {
		changeChannel(channel - 1);
	}
//	void channelDown() {
//		if(power) {
//			if(channel > 1) {
//				channel--;
//				System.out.println("채널" + channel + "번");
//			}
//			else {
//				System.out.println("더이상의 채널이 없습니다.");
//			}			
//		}
//		if(!power) {
//			System.out.println("전원을 켜주세요");
//		}
//	}
	
	//음량 업
	void volumeUP() {
		if(power) {
			if(volume < MAX_VOLUME) {
				volume++;
			}
			showVolume();
		}
	}
//	void volumUp() {
//		if(power) {
//			if(volume >= 0 && volume < 100) {
//				volume++;
//				System.out.println("볼륨: " + volume);
//			}
//			if(volume > 100) {
//				System.out.println("더이상 볼륨을 올릴 수 없습니다.");
//			}
//		}
//		if(!power) {
//			System.out.println("전원을 켜주세요");
//		}
//	}
	
	//음량 다운
	void volumDown() {
		if(power) {
			if(MIN_VOLUME < volume) {
				volume--;
			}
			showVolume();
		}
	}
//	void volumDown() {
//		if(power) {
//			if(volume > 0) {
//				volume--;
//				System.out.println("볼륨: " + volume);
//			}
//			else{
//				System.out.println("더이상 볼륨을 내릴 수 없습니다.");
//			}
//		}
//		if(!power) {
//			System.out.println("전원을 켜주세요");
//		}
//	}
	
	void showVolume() {
		System.out.println("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++) {
			if(i < volume) {
				System.out.println("●");
			}else {
				System.out.println("○");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		
		while(true) {
			System.out.println("1.전원  2.채널변경  3.채널업  4.채널다운\n5.볼륨업  6.볼륨다운  0.종료");
			int input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				tv.power();
				break;
			case 2:
				System.out.println("변경할 채널(1~100)>");
				int ch = ScanUtil.nextInt();
				tv.changeChannel(ch);
				break;
			case 3:
				tv.channelUP();
				break;
			case 4:
				tv.channelDown();
				break;
			case 5:
				tv.volumeUP();
				break;
			case 6:
				tv.volumDown();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);//프로그램을 종료시키는 매서드, 파라메터 값: 뭘 넣든 상관없지만 값은 꼭 넣어주어야 하므로 0을 넣는다.
			}
			
			
		}
		
		
//		TV tv = new TV();
//		while(true) {
//			System.out.println("1.전원 2.채널변경 3.채널업 4.채널다운 5.볼륨업 6.볼륨다운 0.종료");
//			int select = ScanUtil.nextInt();
//			switch(select) {
//			case 1:
//				tv.power();
//				break;
//				
//			case 2:
//				System.out.println("원하시는 채널을 입력해주세요.");
//				int channelNum = ScanUtil.nextInt();
//				tv.specifiChannel(channelNum);
//				break;
//			
//			case 3:
//				tv.channelUp();
//				break;
//				
//			case 4:
//				tv.channelDown();
//				break;
//				
//			case 5:
//				tv.volumUp();
//				break;
//				
//			case 6:
//				tv.volumDown();
//				break;
//				
//			default:
//				System.out.println("번호를 잘못 입력하였습니다.");
//				break;
//			}
//		}
		
	}

}


// 과제2: JVM과 메모리구조에 대해서 찾아보세요
