package g_opp2;

public class AccessTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//같은 클래스 내에서만 사용할 수 있기 때문에 다른 클래스에서는 사용할 수 없음
//		System.out.println(am.privateVar);
//		am.privateMethod();
		

	}

}
