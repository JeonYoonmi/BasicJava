package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 123
		 * 135: 1S 1B 1O
		 * 
		 * 
		 * 123: 1S 0B 2O
		 * 234: 0S 2B 1O
		 * 143:
		 * 587:
		 * 428:
		 * 1~9까지 숫자야구
		 */
		
		 
//		int answer1 = (int) (Math.random() * 9) + 1;
//		int answer2 = (int) (Math.random() * 9) + 1;
//		int answer3 = (int) (Math.random() * 9) + 1;
//
//		while(answer1 == answer2 && answer2 == answer3 && answer1 == answer3) {
//			do {
//				answer2 = (int) (Math.random() * 9) + 1;
//			}while(answer1 != answer2);
//			
//			do {
//				answer3 = (int) (Math.random() * 9) + 1;
//			}while(answer2 != answer3);
//			
//			do {
//				answer3 = (int) (Math.random() * 9) + 1;
//			}while(answer1 != answer3);
//		}
//		
//		
//		
//		System.out.println(answer1 + " " + answer2 + " " + answer3);
	
		
//		int answer1 = (int) (Math.random() * 9) + 1;
//		int answer2 = (int) (Math.random() * 9) + 1;
//		int answer3 = (int) (Math.random() * 9) + 1;
//		
//		do {
//			answer1 = (int) (Math.random() * 9) + 1;
//			answer2 = (int) (Math.random() * 9) + 1;
//			answer3 = (int) (Math.random() * 9) + 1;
//		}while(answer1 == answer2 && answer2 == answer3 && answer1 == answer3);
//		
//		System.out.println(answer1 + " " + answer2 + " " + answer3);
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int answer1 = 0;
//		int answer2 = 0;
//		int answer3 = 0;
//		
//		while (true) {
//			answer1 = (int) (Math.random() * 9) + 1;
//			answer2 = (int) (Math.random() * 9) + 1;
//			answer3 = (int) (Math.random() * 9) + 1;
//			if (answer1 != answer2 && answer2 != answer3 && answer1 != answer3) {
//				break;
//			}
//		}
//		do {
//			answer1 = (int) (Math.random() * 9) + 1;
//			answer2 = (int) (Math.random() * 9) + 1;
//			answer3 = (int) (Math.random() * 9) + 1;
//		}while(answer1 == answer2 || answer2 == answer3 || answer1 == answer3);
//		System.out.println(answer1 + " " + answer2 + " " + answer3);
//		
		
//		int s = 0;
//		int b = 0;
//		int o = 0;
//		
//		do {
//			s = 0;
//			b = 0;
//			o = 0;
//			System.out.print("숫자를 입력하세요.>");
//			int num1 = Integer.parseInt(sc.nextLine());
//			int num2 = Integer.parseInt(sc.nextLine());
//			int num3 = Integer.parseInt(sc.nextLine());
//
//			if (num1 == answer1 || num1 == answer2 || num1 == answer3 ) {
//				if(num1 == answer1) {
//					s += 1;
//				}else if(num1 == answer2 || num1 == answer3) {
//					b += 1;
//				}
//			}
//			
//			if(num2 == answer1 || num2 == answer2 || num2 == answer3) {
//				if(num2 == answer2) {
//					s += 1;
//				}else if(num2 == answer1 || num2 == answer3) {
//					b += 1;
//				}
//			}
//			
//			if(num3 == answer1 || num3 == answer2 || num3 == answer3) {
//				if(num3 == answer3) {
//					s += 1;
//				}else if(num3 == answer1 || num3 == answer2) {
//					b += 1;
//				}
//			}
//			
//			o = 3 - (s + b);
//			System.out.println(s + "s, " + b + "b, " + o + "o입니다.");
//		} while (s != 3);
//		
//		System.out.println("정답입니다!");
		
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		do {
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 == a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.println("3자리 숫자>");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3- strike - ball;
			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + "): " + strike + "S " + ball + "B " + out + "O");
			System.out.println("---------------------------------------");
			
			if(strike == 3) {
				System.out.println("정답입니다!!");
				break;
			}
		}
		
	}

}
