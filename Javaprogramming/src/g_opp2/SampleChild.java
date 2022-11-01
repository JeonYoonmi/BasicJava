package g_opp2;

public class SampleChild extends SampleParent {
	
	void childMethod() {
		System.out.println(var); //상속받은 변수
		System.out.println(method(7, 13)); //상속받은 메서드
	}
	
	//오버라이딩: 부모 클래스로부터 물려받은 메서드의 내용을 재정의 하는 것
	@Override //어노테이션: 변수니 메서드 앞에 써줘서 상태를 알려주는 것
	int method(int a, int b) { //리턴타입, 매서드명, 파라미터 모두 같이야 한다.
		return a * b;
	}
	
	//super: 부모 자식간의 똑같은 이름의 변수나. 메서드를 구분하기 위해 사용 => this. / super(): 자식클래스의 생성자에서 부모클래스의 생성자를 호출하기 위해 사용 => this()
	//this 객체의 주소를 저장하고 있음
	int var;
	
	void test(double var) {
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		
		method(10, 20); //자식 클래스
		super.method(10, 20); //부모 클래스
	}
	
	SampleChild(){
//		super(); //부모 클래스의 생성자 호춭(반드시 있어야 한다) => 부모클래스의 생성자를 초기화 해주려면 필요
		//직접 써주지 않아도 컴파일러가 생성해준다. 부모클래스의 생성자의 파라미터가 있을 때는 컴파일러가 자동으로 호출해주지 못한다.
//		SampleChild sc = new SampleChild();
	}
	
	//다형성: 부모타입의 변수로 자식타입의 객체를 사용하는 것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = /*(SampleParent)*/new SampleChild(); //상속을 하면 서로 형변환이 가능
		//sp = new SampleChild2();
		//sp = new SampleChild3();
		//sp = new SampleChild4();
		
		//변수(부모)타입에 있는 멤버만 사용할 수 있다.
		System.out.println(sp.var);
		sp.method(10, 20);
		
		//타입이 SampleParent이기 때문에 SampleChild에 있는 것은 사용할 수 없음.
//		sp.childMethod();
//		sp.test();
	}
	
	
	

}