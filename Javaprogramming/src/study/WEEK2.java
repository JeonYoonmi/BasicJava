package study;

import java.util.Scanner;

public class WEEK2 {

	public static void main(String[] args) {
//		int score = 90;
//		
//		if(score >= 90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}
//		
//		if(score < 90)
//			System.out.println("점수는 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
		
		
//		int score = 85;
//		if(score >= 90){
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A입니다.");
//		}else {
//			System.out.println("점수는 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}
		
		
//		int score = 75;
//		if(score >= 90) {
//			System.out.println("점수가 100~90입니다.");
//			System.out.println("등급은 A입니다.");
//		}else if(score >= 80) {
//			System.out.println("점수가 80~90입니다.");
//			System.out.println("등급은 B입니다.");
//		}else if(score >= 70) { 
//			System.out.println("점수가 70~80입니다.");
//			System.out.println("등급은 B입니다.");
//		}else {
//			System.out.println("점수가 70미만입니다.");
//			System.out.println("등급은 D입니다.");
//		}
		
		
//		int num = (int)(Math.random() * 6) + 1;
//		
//		if(num == 1) {
//			System.out.println("1번이 나왔습니다.");
//		}else if(num ==2) {
//			System.out.println("2번이 나왔습니다.");
//		}else if(num == 3) {
//			System.out.println("3번이 나왔습니다.");
//		}else if(num == 4) {
//			System.out.println("4번이 나왔습니다.");
//		}else if(num ==5) {
//			System.out.println("5번이 나왔습니다.");
//		}else {
//			System.out.println("6번이 나왔습니다.");
//		}
		
		
//		int num = (int) (Math.random() * 6) + 1;
//		
//		switch(num) {
//			case 1:
//				System.out.println("1번이 나왔습니다.");
//				break;
//			case 2:
//				System.out.println("2번이 나왔습니다.");
//				break;
//			case 3:
//				System.out.println("3번이 나왔습니다.");
//				break;
//			case 4:
//				System.out.println("4번이 나왔습니다.");
//				break;
//			case 5:
//				System.out.println("5번이 나왔습니다.");
//				break;
//			default:
//				System.out.println("6번이 나왔습니다.");
//				break;
//		}
		
		
//		int time = (int) (Math.random() * 4) + 8;
//		System.out.println("[현재 시각: " + time + "시]");
//		
//		switch(time) {
//		case 8:
//			System.out.println("출근합니다.");
//		case 9:
//			System.out.println("회의를 합니다.");
//		case 10:
//			System.out.println("업무를 봅니다.");
//		default:
//			System.out.println("외근을 나갑니다.");
//		}
		
		
//		char grade = 'B';
//		
//		switch(grade) {
//		case 'A':
//		case 'a':
//			System.out.println("우수 회원입니다.");
//			break;
//		case 'B':
//		case 'b':
//			System.out.println("일반 회원입니다.");
//			break;
//		default:
//			System.out.println("손님입니다.");
//		}
		
		
//		String position = "과장";
//		
//		switch(position) {
//			case "부장":
//				System.out.println("700만원");
//				break;
//			case "과장":
//				System.out.println("500만원");
//				break;
//			default:
//				System.out.println("300만원");
//		}
		
		
//		for(int i = 1; i <= 10; i++) { 
//			System.out.println(i);
//		}
		
		
//		int sum = 0;
//		
//		for(int i = 1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println("1~100 합: " + sum);
		
		
//		int sum = 0;
//		
//		int i = 0;
//		for(i=1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println("1~" + (i-1) + "합: " + sum);
		
		
//		for(float x=0.1f; x<=1.0f; x+=0.1f) {
//			System.out.println(x);
//		}
		
		
//		for(int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단  ***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + "x" + n + "=" + (n*n));
//			}
//		}
		
		
//		while(true) {
//			int num = (int) (Math.random()*6)+1;
//			System.out.println(num);
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		
//		outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
//			for (char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if (lower == 'g') {
//					break outter;
//				}
//			}
//		}
//		System.out.println("프로그램 실행 종료");
		
		
//		for(int i=1; i<= 10; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			if(i%3 ==0) {
//				sum += i;
//			}
//		}
//		System.out.println("3의 배수의 총합 = " + sum);
		
		
//		while (true) {
//			int ran1 = (int) (Math.random() * 5 + 1);
//			int ran2 = (int) (Math.random() * 5 + 1);
//			if ((ran1 + ran2) == 5) {
//				System.out.println("(" + ran1 + "," + ran2 + ")");
//				break;
//			}
//		}
		
		
//		for(int x=1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if(4*x + 5*y == 60) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}
		
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 3; j >= i ; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		boolean run = true;
//		int balnce = 0;
//		int money = 0;
//		Scanner scanner = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("--------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("--------------------------------");
//			System.out.print("선택> ");
//			int num = Integer.parseInt(scanner.nextLine());
//			
//			if(num == 1) {
//				System.out.print("예금액>");
//				money += Integer.parseInt(scanner.nextLine());
//			}
//			if(num == 2) {
//				System.out.print("출금액>");
//				money -= Integer.parseInt(scanner.nextLine());
//			}
//			if(num == 3) {
//				System.out.println("잔고>" + money);
//			}
//			if(num == 4) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

