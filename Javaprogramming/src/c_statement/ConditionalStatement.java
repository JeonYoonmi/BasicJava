package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문 >> 조건식들 중에 하나만 작동된다.(만약  true가 여러개 일 때 가장 위에 있는 것으로 나오게 된다.)
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안에 문장을 수행한다.(조건이 하나일 때) >> boolean타입으로 보통 사용.
		 * - else if(조건식){} : 다수의 조건이 필요할 때 if 조건 뒤에 추가한다.
		 * - else{}: 조건식 이외의 경우를 위해 추가한다.(조건식이 없음) >> 위에있는 조건식들이 다 참이 아닐 때 사용할 수 있다.
		 */
		
		int a = 1;
		
		if(a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다."); //true일 때에는 여기까지만 실행되고 바로 빠져 나간다.
		}else if(a == 2) { 
			System.out.println("a == 2");
		}else if(a == 3) {
			System.out.println("a == 3");
		}else {
			System.out.println("else");
		}
		
		//점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 50;
		
		if(60 <= score) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//점수에 들급을 부여
		score = 80;
		String grade = null; //null: 참조용 타입의 기본값
		//기본값: 자동으로 지정되는 값
		//기본형타입의 기본값: 0
		//boolean 기본값: false
		
		if(90 <= score && score <=100) {
			grade = "A";
		}else if(80 <= score) {
			grade = "B";
		}else if(70 <= score) {
			grade = "C";
		}else if(60 <= score) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(score + "/" + grade);
		
		//자동정렬: ctrl + shift + f (원하는 만큼만 블럭지정하기)
		score = 62;
		grade = null;
		if(90 <= score && score <= 100) {
			grade = "A";
			if(97 <= score) {
				grade += "+";
			}else if(score <= 93) {
				grade += "-";
			}
		}else if(80 <= score) {
			grade = "B";
			if(87 <= score) {
				grade += "+";
			}else if(score <= 83) {
				grade += "-";
			}
		}else if(70 <= score) {
			grade = "C";
			if(77<= score) {
				grade += "+";
			}else if(score <= 73) {
				grade += "-";
			}
		}else if(60 <= score) {
			grade = "D";
			if(67 <= score) {
				grade += "+";
			}else if(score <= 63) {
			grade += "-";
		}else
			grade = "F";
		}
		System.out.println(score + "/" + grade);
		
		
		/*
		 * switch문
		 * - switch(int/String){case 1 : break;}
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 10;
		switch(a) {
		case 10:
			System.out.println("a == 10");
			break; //break가 없다면 그 다음에 case조건에 상관없이 break가 있는 곳까지 실행
		case 20:
			System.out.println("a == 20");
			break;
		default: //if문에 있는 else와 같은 역할, 위에있는 조건이 하나도 맞지 않을 때 수행
			System.out.println("defalte");
		}
		
		
		String str = "a";
		switch(str) {
		case "a":
			break;
		case "b":
			break;
		}
		
		
		//월에 해당하는 계절
		int month = 12;
		String season = null;
		switch(month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
			
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
			
		case 9: case 10: case 11:
			season = "기을";
			break;
			
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "/" + season);
		
		
		score = 54;
		grade = null;
		switch(score /10) {
		case 10: case 9:
			grade = "A";
			break;
			
		case 8:
			grade = "B";
			break;
			
		case 7:
			grade = "C";
			break;
			
		case 6:
			grade = "D";
			break;
			
		default:
			grade = "F";
			break;
		}
		System.out.println(score + "/" + grade);
		//같은 문장에 대해서는 switch문이 조금 더 빠르다
		
		
		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요>");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		switch(num) {
//		case 0:
//			System.out.println("0 입니다.");
//			break;
//			
//		default:		
//			System.out.println("0이 아닙니다.");
//			break;
//		}
//		
//		
//		SYstem.out.println("숫자>");
//		int num = Integer.parseInt(sc.nextLine());
//		if(num == 0) {
//			System.out.println("0 입니다.");
//		}else {
//			System.out.println("0이 아닙니다.");
//		}
		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.print("숫자>");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}else
//			System.out.println("홀수입니다.");
		
		
		//점수 3개를 입력받아 합계, 평균, 등급을 출력해주세요.
		
//		System.out.print("국어>");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.print("영어>");
//		int eng = Integer.parseInt(sc.nextLine());
//		System.out.print("수학>");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		int sum = kor + eng + math;
//		double avg = sum / 3.0;
//		
//		System.out.println("합계: " + sum);
//		System.out.println("평균: " + avg);
//		
//		grade = null;
//		if(90 <= avg && avg <= 100) {
//			grade = "A";
//			if(97 <= avg) {
//				grade += "+";
//			}else if(avg <= 93) {
//				grade += "-";
//			}
//		}else if(80 <= avg) {
//			grade = "B";
//			if(87 <= avg) {
//				grade += "+";
//			}else if(avg <= 83) {
//				grade += "-";
//			}
//		}else if(70 <= avg) {
//			grade = "C";
//			if(77<= avg) {
//				grade += "+";
//			}else if(avg <= 73) {
//				grade += "-";
//			}
//		}else if(60 <= avg) {
//			grade = "D";
//			if(67 <= avg) {
//				grade += "+";
//			}else if(avg <= 63) {
//				grade += "-";
//		}else
//			grade = "F";
//		}
		
		
		//1~100사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		int num1 = (int) (Math.random() * 100) + 1;
		int num2 = (int) (Math.random() * 100) + 1;
		int num3 = (int) (Math.random() * 100) + 1;

		if (num1 > num2 && num3 > num1) {
			System.out.println(num3 + " " + num1 + " " + num2);
		}
		if (num1 > num2 && num3 > num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		if (num1 > num3 && num2 > num1) {
			System.out.println(num2 + " " + num1 + " " + num3);
		}
		if (num2 > num3 && num1 < num3) {
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		if (num3 > num1 && num2 > num1) {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
		
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println(num1 + " < " + num2 + " < " + num3);
		
		
		
	}
}

 
