package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지행 프로그래밍
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고(코드의 일부 내용이 전체 코드에서 여러번 반복될 수도 있는데 그럴 떄 코드가 나누어져 있으면 또같은 코드가 계속 반복되지 않을 수 있다)
		 * 		 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass()/*클래스이름(타입)*/;
		
		sc.field = 10;
		
		String rtnValue = sc.method(20);
		
		System.out.println(rtnValue);
		
		sc.method2();
		
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 지정된 변수를 통해 매서드를 호출해주세요.
		//파라미터가 있는 매서드는 타입에 맞는값을 남겨주시고,
		//리턴타입이 있는 매서드는 리턴받은 값을 출력해주세요.
		ClassMaker s = new ClassMaker();
		
		s.method1();
		
		int rtn1 = s.method2();
		System.out.println(rtn1);
		
		s.method3(10);
		
		int rtn2 = s.method4(15, 20);
		System.out.println(rtn2);
		
		
		
		
		
		
		
		
		
		
	}

}
