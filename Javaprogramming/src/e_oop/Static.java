package e_oop;

public class Static {
	/*
	 * - static을 붙이면 프로그램 실행시 메모리에 올라간다.
	 * 객체생성을 하지 않아도 사용할 수 있다.
	 * - static이 붙은 멤버의 명침: 클래스 변수, 클래스 메서드
	 * - static이 붙지 않은 멤버의 명칭: 인스턴스 변수, 인스턴스 메서드
	 */
	
	//객체 == 인스턴스
	//객체생성 == 인스턴스화
	//위치에 따라서 전역변수
	//static에 따라서 인스턴스 변수
	int var;
	
	//위치에 따라서 전역변수
	//static에 따라서 클래스 변수
	static int staticvar;
	//모든 객체에서 공유해서 사용할 수 있다.

	public static void main(String[] args) {
		//위치에 따라서 지역변수
		int local = 0;
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.salary = 1000000;
		e2.salary = 2000000;
		
		System.out.println("e1.salary : " + e1.salary);
		System.out.println("e2.salary : " + e2.salary);
		
		
		//이렇게 쓰면 인스턴스 변수인지 혼동이 올 수 있음.
		e1.lunch = 7000;
		System.out.println("e1.lunch : " + e1.lunch);
		System.out.println("e2.lunch : " + e2.lunch);
		
		e2.lunch = 8000;
		System.out.println("e1.lunch : " + e1.lunch);
		System.out.println("e2.lunch : " + e2.lunch);
		
		
		Employee.lunch = 10000; //올바른 방법 class명.클래스변수
		
		//Math라는 클래스명을 붙여서 사용, 자주 사용하기 때문에 객체생성하지 않으려고
		//Scanner도 자주 쓰는데 계속 객체생성을 함
		//Math.radom()
		//Math.round()
		
		System.out.println("문자열 입력>");
		String nextLine = ScanUtil.nextLine();
		
		System.out.println("숫자 입력>");
		int nextInt = ScanUtil.nextInt();
		
		
	}

}

class Employee{
	
	int salary; //월급
	static int lunch; //점심 식사비
}


