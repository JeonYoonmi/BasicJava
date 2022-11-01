package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){} //블럭({})안에 있는 문장을 정해진 횟수 만큼 반복하는 문장(회수가 정확하게 정해져 있는 경우)
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 번복하는 문장
		 */
		
		for(int i = 1; i <= 10; i++) {
			//초기화: 조건식과 증감식에 사용할 변수를 초기화 한다.
			//조건식: 연산결과가 true이면 블럭안에 있는 내용을 수정한다.(boolean타입의 문장이 와야한다.)
			//증감식: 변수를 증가/감소시켜 반복문을 제어한다.
			//실행순서: 초기화>>조건식>>실행(True이면)>>증감식 => 이 형태를 계속 반복(false가 나올 때까지)
			System.out.println((i + "번째 반복"));
		}
		
		int sum = 0;// 1~10까지 합계를 저장
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 10; i >= 1; i--) {
			sum += i;
		}
		System.out.println(sum);
		
		
		//1부터 100까지 짝수의 합계를 출력해주세요.
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;

		for (int i = 2; i <= 100; i += 2) {
				sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 홀수의 합계를 출력해주세요.
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;

		for (int i = 1; i <= 100; i += 2) {
				sum += i;
		}
		System.out.println(sum);
		
		//구구단 출력
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * ...
		 */
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(2 + " * " + i + " = " + i * 2);
		}
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(6 + " * " + i + " = " + i * 6);
		}
		
		//구구단 전체를 출력해주세요.
		for(int j = 1; j <= 9; j++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + j * i);
			}
		}
		
		/* 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
		 * 2 * 2 = 4	3 * 2 = 6	4 * 2 = 8
		 * 2 * 3 = 6	3 * 3 = 9	4 * 3 = 12
		 * ...
		 */
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
		
		/*
		 * while문
		 * - while(조건식){} //조건식:boolean타입
		 * - 포함하고 있는 문장들을 조건삭이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
		Scanner s = new Scanner(System.in);
		
		int input = 0;
		while(input != 3) {
			System.out.println("1. 선택1  2. 선택2  3. 종료>");
			input = Integer.parseInt(s.nextLine());
		}
		
		/*
		 * do-while문
		 *  - do{}while(조건식);
		 *  - 최소한 한 번의 수행을 보장한다.
		 */
		
		
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		do {
			System.out.println("1~100 사이의 수를 입력해주세요.");
			input = Integer.parseInt(s.nextLine());
			
			if(answer < input) {
				System.out.println(input + "보다 작습니다.");
			}else if(answer > input) {
				System.out.println(input + "보다 큽니다.");
			}else {
				System.out.println("정답입니다!!");
			}
		}while(answer != input);
		
		
		//이름붙은 반복문
		outer : for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 5) {
					break; //가장 가까운 반복문 하나를 빠져나간다.
					break outer; //outer라는 이름의 반복문을 빠져나간다.
					continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다. >>for문의 증감식으로 간디
					continue outer; //outer라는 이름의 현재 반복 회차를 빠져나간다. >>outer의 증감식으로 간다.
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("*****");
		System.out.println("****");
		System.out.println("***");
		System.out.println("*");
		System.out.println("*");

		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");

		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
		
		for(int i = 1; i <= 5; i++) {
			for(int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= 2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}

