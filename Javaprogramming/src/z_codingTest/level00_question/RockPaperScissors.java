package z_codingTest.level00_question;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		/*
		인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		-------------- Console -----------------
		가위 바위 보를 입력하세요 >> 가위
		게이머 :  가위
		인공지능 컴퓨터 : 바위
		결과 : 인공지능 컴퓨터 승리!
		*/
		
		String[] num = {"가위", "바위", "보"};
		int ran = (int)(Math.random()*3+1);
		String ai = num[ran];
		
		Scanner s = new Scanner(System.in);
		System.out.println("-------------- Console -----------------");
		System.out.print("가위 바위 보를 입력하세요>> ");
		String gammer = s.nextLine();
		System.out.println("게이머: " + gammer);
		System.out.println("인공지능: " + ai);
				
		if(gammer.equals(ai)) {
			System.out.println("무승부 !");
		}else if(gammer.equals("바위")) {
			System.out.println(ai.equals("보") ? "인공지능 컴퓨터 승리 !" : "게이머 승리 !");
		}else if(gammer.equals("가위")) {
			System.out.println(ai.equals("바위") ? "인공지능 컴퓨터 승리 !" : "게이머 승리 !");
		}else {
			System.out.println(ai.equals("가위") ? "인공지능 컴퓨터 승리 !" : "게이머 승리 !");
		}
		
		
		
//		
//		if(ai.equals("가위")) {
//			if(gammer.equals("가위")) {
//				System.out.println("비겼습니다.");
//			}
//			if(gammer.equals("바위")) {
//				System.out.println("게이머 승리 !");
//			}
//			if(gammer.equals("보")) {
//				System.out.println("인공지능 컴퓨터 승리 !");
//			}
//		}
//		if(ai.equals("바위")) {
//			if(gammer.equals("가위")) {
//				System.out.println("인공지능 컴퓨터 승리 !");
//			}
//			if(gammer.equals("바위")) {
//				System.out.println("비겼습니다");
//			}
//			if(gammer.equals("보")) {
//				System.out.println("게이머 승리 !");
//			}
//		}
//		if(ai.equals("보")) {
//			if(gammer.equals("가위")) {
//				System.out.println("게이머 승리 !");
//			}
//			if(gammer.equals("바위")) {
//				System.out.println("인공지능 컴퓨터 승리 !");
//			}
//			if(gammer.equals("보"))
//			{
//				System.out.println("비겼습니다");
//			}
//		}
		
		
		
	}

}
