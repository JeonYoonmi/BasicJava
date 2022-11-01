package a_variable; //패키지: 클래스의 위치

import java.util.Scanner;
//import 단축기: ctrl + shift + o

public class Variable { //클래스: 자바프로그램의 구성요소

	public static void main(String[] args) {//메서드: 명령문의 집합
		//main 메서드: 프로스램의 시작과 끝
		//주석: 프로그램 코드로 인식하지 않은 문장(주로 코드를 설명하는데 사용)
//		한줄 주석: ctrl + shift + c
		/*범위 주석: ctrl + shift + /(해제: \)*/
		
		//변수: 데이터를 저장할 공간 -> 이름 중복x
		
		int x;//x라는 이름을 가진 정수를 지정할 수 있는 공간을 만들어라
		//세미콜론(;): 문장의 마침표
		
		/*
		 * 기본형 타입
		 * - 정수: byte(1), short(2), *int(4/약20억). long(8)
		 * - 실수: float(4/7자리->7자리까지는 정확할 수 있는데 그 이상은 아님), *double(8/15자리)
		 * - 문자: char(2)->2바이트 크기(한글자만 표현할 수 있다.)
		 * - 논리: boolean(1)
		 * 
		 * 참조형 타입(주소를 저장)
		 * - 문자열: String(4)->char는 한글자지만 여러글자를 표현할 수 있고, 클레스임 => 4바이트(주소를 저장하기 위한 크기)
		 * 
		 * 명명규칙
		 * - 영어는 대소문자, 한글(가능하면 안쓰는게 좋음), 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어(자바에서 이미 사용하고 있는 단어 ex. int)는 사용할 수 없다.
		 * - [낙타식표기법(단어가 바뀔 때 다음 단어의 첫자를 대문자)을 사용한다.(mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)] -> []반드시 해야하는 것은 아니자만 자바로 개발하는 동안엔 사용하는 것이 좋음
		 */
		
		float y;
		boolean z;
		
		//9가지 타입을 모두 사용해 9개의 변수를 선언
		byte a;
		short b;
		long n;
		double d;
		char e;
		String f;
		
		//초기화(변수에 처음으로 값을 저장하는 것)
		//=(대입 연산자): 오른쪽의 값을 왼쪽의 변수에 저장한다.
		
		x = 10;
		y = 3.14f; //접미사 f를 붙여야 float타입이 된다.
		long l = 20L; //접미사 L을 붙여야 long타입이 된다.(소문자도 사용은 가능하나 1과 혼동이 있을 수 있어서 대문자로 쓰는 편)
		char c = '가'; //여러글자 안되고 글자가 없어도 안된다. 작은따옴표로 표현
		z = true; //true, false
		String s = "가나다라 abcd 1234"; //쌍따옴표로 묵어서 표현
		
		//위에서 선언한 9개의 변수들을 초기화 해주세요
		
		x = 30; //변수에는 하나의 값만 저장된다
		
		//형변환 => 기본형 타입 끼리, 참조형 타입끼리 형변환 된다. 불린 타입은 형변환 안된다.
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long;
		_long = _int; //int타입은 자동으로 형변환이 돼서 저장이 된다. -> 형변환을 자동으로 했을 떄 데이터의 손실이 있느냐 없느냐의 차이
		
		//변수 3개를 선언해 변수의 타입과 다른 타입으로 초기화 해주세요.

		
		
		
		
		
		//출력(콘솔)->메서드의 도움을 받음
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포멧 지정");
		
		//실헹:ctrl + f11
		
		//탈출 문자(Escape 문자) -> \ , 원래의 기능에서 탈출시킨다.
		System.out.println("탭은 \t4칸에 맞춰 띄워줍니다."); //\t: 여러칸(공백 4개)이 띄어진다.
		System.out.println("줄바꿈을\n해줍니다."); //\n: 줄바꿈
		System.out.println("\"쌍따옴표를 넣어줍니다.\"");
		System.out.println("\\역슬래시를 넣어줍니다.");
		
		
		//입력
//		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
//		System.out.print("아무거나 입력해주세요>");
//		String str = sc.nextLine();  //문자열을 입력받음
//		System.out.println("입력받은 내용: " + str);
//		
//		//버그가 있어서 사용하지 않는 것이 좋다.
//		System.out.println("숫자 입력>");
//		int num = sc.nextInt(); //int타입으로 값을 받을 수 있음 -> 문자를 입력하고 엔터를 티는데 엔터까지 가져가지 않으면서 아래에 있는 문자열 받는 애가 엔터를 가지고 간다.
//		System.out.println("입력받은 숫자: " + num);
//		
//		System.out.print("문자열 입력>");
//		String str = sc.nextLine();
//		System.out.println("입력받은 문자열: " + str);
//		
//		int num = Integer.parseInt(sc.nextLine()); 
//		double num2 = Double.parseDouble(sc.nextLine()); //문자열 형변환

	
	
//		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해주세요.
//		System.out.println("이름 입력>");
//		String name = sc.nextLine();
//		/*System.out.println("이름>");
//		 * 해설 String myName = sc.nextLine();
//		 */
//		
//		
//		//자신의 나이를 저장할 변수를 선언하고 Scanner를 이용해 나이를 저장해주세요.
//		System.out.println("나이 입력>");
//		int age = Integer.parseInt(sc.nextLine());
//		/*해설
//		 * System.out.println("나이 입력>");
//		 * int myAge = Integer.parseInt(sc.nextLine());
//		 */
//		
//		
//		//이름과 나이를 출력
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		/*해설
//		 * System.out.println("이름: " + myName + " / 나이: " + myAge); -> int타입은 +로 연결 => 어떤타입이든 더해지면 스트링 타입으로 바뀜
//		 */
		
		
	}
}
