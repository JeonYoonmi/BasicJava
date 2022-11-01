package e_oop;

public class VariableInit {
	
	//변수를 초기화하는 방법 3가지
	//명시적 초기화
	int var = 10;	
	static int classVar = 20;

	//초기화 블럭
	{ //객체생성을 해야 사용할 수 있는 영역
		var = 30;
//		classVar = 30; //객채 생성을 해야만 사용할 수 있는데  static은 이미 객체생성을 하지 않아도 데이터가 올라와 있는 상태이기 떄문에 사용할 수 있음
	}//인스턴스 변수(class변수를 초가화해도 가능)
	
	static { //객체생성 없이 사용할 수 있는 영역
		classVar = 40;
//		var = 40; //인스턴스 변수는 객체생성을 해야만 사용할 수 있는데 객체생성을 하지 않았기 떄문에 컴파일 에러가 발생

	}// class 변수

	// 생성자★
	/*
	 * - 클래스와 같은이름의 메서드
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성치를 만들어준다. 
	 * - 생성자는 리턴타입이 없다.
	 * - 인스턴스 변수 초기화에 파라미터가 필요할 때 인스턴스를 사용한다.
	 */
	
	//초가화 순서: 명시적 초기화 > 초기화 블럭 > 생성자

	VariableInit() {
		var = 50;
	}

	public static void main(String[] args) {
		Init i1 = new Init();
		i1.a = 10;
		i1.b = 20;
		i1.c = 30;

		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;

		Init i3 = new Init(70, 80, 90);
	}
}

class Init {
	int a;
	int b;
	int c;

	Init(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c; //지역변수
		// this:인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용
	}
	
	//오버로딩: 같은 이름의 메서드를 여러개 정의하는 것
	//조건: 파라미터 타입이나 개수가 달라야 한다
	Init(){
//		System.out.println();
		this(10, 20, 30);
		//this(): 생성자애 다른 생성자를 호출 할 때 사용한다.
	}//다른 생성자가 있을 때는 만들지 않는다
	//메서드는 이름이 같을 수 있음

}	
