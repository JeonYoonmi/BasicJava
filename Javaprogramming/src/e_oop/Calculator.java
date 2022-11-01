package e_oop;

import java.util.Scanner;

public class Calculator {
	// +, -, *, /, %를 계산해주는 메서드 생성
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		Calculator c = new Calculator();
//
//		System.out.print("첫번째 숫자를 입력해주세요.> ");
//		double num1 = Double.parseDouble(s.nextLine());
//
//		System.out.print("두번째 숫자를 입력해주세요.> ");
//		double num2 = Double.parseDouble(s.nextLine());
//
//		boolean run = true;
//		while (run) {
//
//			System.out.print("원하는 연산을 입력해주세요.> ");
//			String O = s.nextLine();
//
//			if (O.equals("+")) {
//				double result = c.plus(num1, num2);
//				System.out.println(result);
//				num1 = result;
//			}
//			if (O.equals("-")) {
//				double result = c.minus(num1, num2);
//				System.out.println(result);
//				num1 = result;
//			}
//			if (O.equals("*")) {
//				double result = c.multiply(num1, num2);
//				System.out.println(result);
//				num1 = result;
//			}
//			if (O.equals("/")) {
//				double result = c.division(num1, num2);
//				System.out.println(result);
//				num1 = result;
//			}
//			if (O.equals("%")) {
//				double result = c.remainder(num1, num2);
//				System.out.println(result);
//				num1 = result;
//			}
//
//			System.out.println("--------------------");
//			System.out.println("1.계속하기 | 2.그만하기");
//			System.out.println("--------------------");
//			System.out.println("선택> ");
//			int num = Integer.parseInt(s.nextLine());
//			if (num == 1) {
//				System.out.print("숫자를 입력해주세요.> ");
//				num2 = Double.parseDouble(s.nextLine());
//			}
//			if (num == 2) {
//				break;
//			}
//		}
//	}

	
	
	
	
//	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		
//		double rtn = c.plus(123456, 654321);
//		rtn = c.minus(rtn, 123456);
//		rtn = c.multiply(rtn, 123456);
//		rtn = c.division(rtn, 654321);
//		rtn = c.remainder(rtn, 123456);
//		
//		System.out.println(rtn);
//		
//	}
			
	double plus(double num1, double num2) {
		return num1 + num2;
	}
	
	double minus(double num1, double num2) {
		return num1 - num2;
	}
	
	double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	double division(double num1, double num2) {
		return num1 / num2;
	}
	
	double remainder(double num1, double num2) {
		return num1 % num2;
	}

}
