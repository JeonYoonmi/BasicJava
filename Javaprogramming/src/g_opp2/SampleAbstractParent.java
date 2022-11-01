package g_opp2;

//추상 클래스: 추상 메서드를 가지고 있는 클래스 => 객체 생성을 하지 못하는데 만드는 이유: 상속시키기 위해 = 부모 클래스를 만들기 위해
public abstract class SampleAbstractParent {
	
	//추상 메서드: 선언부만 있고 구현부가 없는 메서드 => 객체생성을 할 수 없는 메서드
	abstract void abstractMethod();
	
	
}

class SampleAbstractChild extends SampleAbstractParent{
	//컴파일 에러 => 추상 메서드를 상속 받으면 추상메서드를 가지고 있으므로 추상 클래스여야 하는데
	//			추상 클래스를 만들지 않을 것이므로 오버라이딩을 한다. -> 내용을 구현해줘야 한다.

	//추상 메서드를 상속받으면 반드시 내용을 만들어야 한다.
	//자식마다 똑같은 메서드인데 내용이 다를 수 있기 떄문에 추상 클래스로 부모 클래스를 만든 뒤에 상속클래스를 만든다.
	@Override
	void abstractMethod() {
		
		
	} 
	
}