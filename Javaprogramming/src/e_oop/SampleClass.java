package e_oop;

public class SampleClass {
	//class는 변수와 매소드로 구성
	
	int field; //전역변수: 클래스 전체 영역에서 사용하는 변수 -> 초가화를 하지 않아도 자동으로 초기화(기본값으로)
	
	public static void main(String[] args) {
		int local = 0; //지역변수: 매서드 안에서만 사용하는 변수 -> 초기화를 해줘야 한다.
	}
	/*
	 * - 매서드: 변수를 가지고 할 일
	 * - 선언방법: 리턴타입 매서드명 (파라미터){ }
	 * - 파라미터(매개변수): 실행에 필요한 정보
	 * - 리턴타입: 실행 후 돌려줘야하는 결과물
	 */
	
	String /*리턴타입*/ method(int parameter/*파라미터*/) {
		method2();		
		return parameter + "를 받아 명령을 수행하고 결과물을 리턴하는 매서드";
	}
	
	void method2() { //리턴타입이 있을 경우에는 반드시 리턴을 해줘야 한다.
		System.out.println("파라미터도 리턴타입도 없는 매서드");
	
	
			//Math.random() //파라미터가 없어도 계산
			//Math.round(double) //어떤값을 반올림할건지 
	}
	
	//flowTest1() 호출시 출력되는 문장에 순서대로 번호를 붙여주세요
	void flowTest1() {
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	
	
	
	
}
