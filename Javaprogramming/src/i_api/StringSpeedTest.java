package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {

		//String타입은 문자열을 변경하면 객체를 새로 만든다
		String str = "a";
		
//		long start = System.currentTimeMillis();
//		//현재 시간을 1/1000초 단위로 나타내줌
//		for(int i = 0; i < 200000; i++) {			
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		//기존에 있던거에 추가되는 것이 아니라 아예 새로운것
		//문제점
		//1. 주소가 변수에 저장되는데 원래 100번지라면 추가된거는 주소가 바뀌어서 100번지가 아니다.
		//2. 이런걸 많이 만들면 객체를 계속 만들기 때문에 속도가 느려진다. 
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
