package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("숫자 >");
//		Double num1 = Double.parseDouble(sc.nextLine());
//		System.out.print("연산자 >");
//		String O = sc.nextLine();
//		System.out.print("숫자 >");
//		Double num2 = Double.parseDouble(sc.nextLine());
//		
//		System.out.println(O.equals("+") ? num1 + num2 : 
//			(O.equals("-") ? num1 - num2 : 
//				(O.equals("*") ? num1 * num2 :
//					(O.equals("/") ? num1 / num2 : 
//						(O.equals("%") ? num1 % num2 : "입력 오류")))));
		
		
		
		
		
		
		
		
		
		
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자 >");
		int x = Integer.parseInt(s.nextLine());
		
		System.out.print("연산자 >");
		String op = s.nextLine();
		
		System.out.print("두번째 숫자 >");
		int y = Integer.parseInt(s.nextLine());
		
		int result = op.equals("+") ? x + y 
				: op.equals("-") ? x - y
				: op.equals("*") ? x * y 
				: op.equals("/") ? x / y 
				: x % y;
		System.out.println(x + " = " + op + " " + y + " = " + result);
	}

}
