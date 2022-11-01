package e_oop;

public class ClassMaker {
	//파라미터와 매서드 이름은 내가 원하는거로 만들 수 있음.
	/*
	 * return
	 * 1. return 값을 돌려줌(일 시킨 사람한테)
	 * 2. return이 나오면 method를 종료시킨다.
	 * 
	 * 리턴타입이 없는 매서드에서 return;이 나오면 매서드를 종료하는 역할만 해준다.
	 * void c(int a){
	 * 	if(a==1){
	 * 		return;
	 * 	}
	 * 	if(a==2){
	 * 	.....
	 * 	}
	 * 	.
	 * 	.
	 * 	.
	 */
	
	//전역변수 하나를 선언 및 초기화 해주세요.
	int a;
	
	//리턴타입과 파라미터가 없는 매서드 하나를 만들어주세요.
	//매서드 안에서 전역변수를 출력해주세요.
	void method1(){
		System.out.println(a);
	}
	
	//전역변수와 같은 타입으로 리턴타입이 있고 파라미터가 없는 매서드 하나를 만들어주세요.
	//매서드 안에서 전역변수를 리턴해주세요
	int method2() {
		return a;
	}
	
	//리턴타입은 없고 파라미터가 있는 매서드 하나를 만들어주세요.
	//매서드 안에서 파라미터를 출력해주세요.
	void method3(int parameter) {
		System.out.println(parameter);
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 매서드 하나를 만들어주세요.
	//매서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	//파라미터 두개의 타입이 같아도 타입울 둘 다 적어줘야 한다.
	int method4(int parameter1, int parameter2) {
		return parameter1 * parameter2;
	}
	
	
	
	
	
	
	
	
	
	

}
