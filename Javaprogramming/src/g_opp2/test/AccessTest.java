package g_opp2.test;

import g_opp2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//같은 패키지에서 접근이 가능 => 하위패키지라고 헤서 상위 패키지에 속해있는것이 아닌 아예 다른 패키지
		//상속받은 클래스로 바꾸면 AccessModifier로 접근을 하는 것이 아니라 내것으로 접근해야한다
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
		//같은 패키지에서 접근이 가능
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
		//같은 클래스 내에서만 사용할 수 있기 때문에 다른 클래스에서는 사용할 수 없음
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		
		AccessTest at = new AccessTest();
		
		System.out.println(at.protectedVar);
		at.protectedMethod();

	}

}
