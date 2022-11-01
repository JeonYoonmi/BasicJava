package h_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.FieldPosition;

public class ExceptionHadling {

	public static void main(String[] args) {
		/*
		 * 에러
		 * - 컴파일 에러: 컴파일시(컴퓨터 언어로 번역하는거)에 발생되는 에러(빨간줄)
		 * - 논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러: 실행 시에 발생되는 에러(콘솔창 빨간글씨)
		 * 
		 * 런타임 에러
		 * - 런타임 에러 발생시 발샐힌 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러: 프로그램 코드에 의해 수습될 수 없는 다소 심각한 오류
		 * - 예외: 프로그램 코드에 의해서 수습된 수 있는 다소 미약한 오류
		 * 
		 * 예외
		 * - 모즌 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되진 않는다
		 * - [RuntimeException 클래스와  그 자식들을 제외한]
		 * 		Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try{} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 파라미터로 처리할 예외를 지정해줄 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭 안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
		
		try {
		int result = 10 / 0; //정수는 0으로 나눌 수 없기 때문에 에러가 발생
		System.out.println(result); //위에줄이 에러가 나면서 32번 위치에서 프로그램이 종료되면서 이 줄은 실행되지 않는다.
		} catch(java.lang.ArithmeticException | IndexOutOfBoundsException e) { //파라미터가 들어가야 함: 지금 예외가 java.lang.ArithmeticException인데 이 타입을 파라미터로 넣어주어야 한다. 
			//예외가 발생했는지 조차 안나오기 때문에 보이게 하기 위해서 오류가 났다고 인쇄해준다.
			e.printStackTrace();
			
			//catch에 여러개의 파라미터를 넣고 싶으면 
			//1. | 를 이용해서 해준다. => 둘중에 하나가 발생하면 인쇄한다.
		} catch(NullPointerException e) {
			//2. catch를 여러번 써준다. => 예외처리가 강제적으로 일어날 경우에만 사용하는데 잘 사용하지 않음
			e.printStackTrace();

		} catch(Exception e) {
			//3. 한번에 모든 예외를 처리하는 방법: 파라미터에 Exception을 넣는다  -> 다형성 이용
			e.printStackTrace();

		}
		
		test1();
	}
	//java.lang.ArithmeticException: 예외 이름
	//by zero: 예외 원인
	//h_exception.ExceptionHadling.main(ExceptionHadling.java:33): 예외 위치  => ExceptionHadling.java:33를 클릭하면 예외가 발생한 위치로 보내줌

	private static void test1() {
		test2();
	}
//	private static void test2() {
//		System.out.println(10 / 0);
//	}
	//at h_exception.ExceptionHadling.test2(ExceptionHadling.java:61) -> 가장 최근에 발생한 예외 => 가장 마지막에 시행됐으므로 문제가 발생했을 확률이 가장 높은 위치, 하지만 그 문장이 내가 만든 것이 아닌 경우가 있음
	//at h_exception.ExceptionHadling.test1(ExceptionHadling.java:58)
	//at h_exception.ExceptionHadling.main(ExceptionHadling.java:51) -> 가장 처음에 발생한 예외
	
	private static void test2() {
//		System.out.println(10 / 0);
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		
	}
	//at h_exception.ExceptionHadling.test2(ExceptionHadling.java:75) -> 위치
	//at h_exception.ExceptionHadling.test1(ExceptionHadling.java:63)
	//at h_exception.ExceptionHadling.main(ExceptionHadling.java:56)
}
