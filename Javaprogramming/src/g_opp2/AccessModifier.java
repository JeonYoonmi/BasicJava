package g_opp2;

public class AccessModifier {
	public String publicVar = "public : 접근제한이 없음"; //아무데나 누구나 접근가능
	protected String protectedVar = "prodtected : 같은 패키지 + 상속받은 클래스에서 접근 가능";//패키지가  같지 않더라도 생략 가능
	String defaultVar = "default : 같은 패키지에서만 접근 가능"; //default는 생략됨
	private String privateVar = "provate : 클래스 내에서만 접근 가능";
	
	public void publicMethod() {
		System.out.println(publicVar);
	}
	
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaultMethod() {
		System.out.println(defaultVar);
	}
	
	private void privateMethod() {
		System.out.println(privateVar);
	}

	
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해 => 의도 된 값이 아닌 다른 값은 목들어오게 하겠다
		 * - 사용하는데 불필요한 멤버를 숨기기 위해
		 * 		=> ctrl+space를 누르면 나오는 다양한 아이들이 나오는데 다 접근 가능으로 해 놓으면 너무 많은 것들이 나오기 떄문에 필요한 것들만 나오게 하기 위함
		 */
		System.out.println(am);
		
		Time time = new Time();
		
		//접근 제한을 private로 걸었음
//		time.hour = 9;
//		time.minute = 44;
//		time.second = 9999;
		
		time.setHour(9);
		time.setMinute(59);
		time.setSecond(55);
		
		System.out.println(time);
		
		time.clock();
	}
	

}


