package study;

import java.util.Arrays;
import java.util.Scanner;


public class Quiz {

	public static void main(String[] args) {
		/*
		1.
		다음 배열에서 최댓값과 최솟값을 구하시오.
		{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}

		2.
		로또번호를 생성하는 프로그램을 작성하시오.
		(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)

		3.
		인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		-------------- Console -----------------
		가위 바위 보를 입력하세요 >> 가위
		게이머 :  가위
		인공지능 컴퓨터 : 바위
		결과 : 인공지능 컴퓨터 승리!

		4.
		주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 
		주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다. 
		난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
		확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
		(아래 예시와 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.)
		------------- Console -----------------
		-------------
		면       빈도
		-------------
		1        1725
		2        1620
		3        1687
		4        1626
		5        1657
		6        1685
		*/
		
		//Q1
		int[] arr = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값: " + max + " / " + "최소값: " + min);
		
		
		//Q2
		int[] lotto = new int[6];
		int count = 0;
		int ran = (int) (Math.random() * 45) + 1;

		do {
			for(int j = 0; j < lotto.length; j++) {
				if (lotto[j] == ran) {
					ran = (int) (Math.random() * 45) + 1;
					break;
				}
				if (lotto[j] != ran) {
					lotto[count++] = ran;
				}
			}
		}while(count != 5);
		
		System.out.println(Arrays.toString(lotto));
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
		}
		for(int i = 0; i < lotto.length - 1; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] == lotto[i + 1]) {
					lotto[i + 1] = (int)(Math.random()*45 + 1);
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		
		//Q3
		String[] num = {"가위", "바위", "보"};
		int ran = (int)(Math.random()*3+1);
		String ai = num[ran];
		
		Scanner s = new Scanner(System.in);
		System.out.println("-------------- Console -----------------");
		System.out.print("가위 바위 보를 입력하세요>> ");
		String gammer = s.nextLine();
		System.out.println("게이머: " + gammer);
		System.out.println("인공지능: " + ai);
				
		if(ai.equals("가위")) {
			if(gammer.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			if(gammer.equals("바위")) {
				System.out.println("게이머 승리 !");
			}
			if(gammer.equals("보")) {
				System.out.println("인공지능 컴퓨터 승리 !");
			}
		}
		if(ai.equals("바위")) {
			if(gammer.equals("가위")) {
				System.out.println("인공지능 컴퓨터 승리 !");
			}
			if(gammer.equals("바위")) {
				System.out.println("비겼습니다");
			}
			if(gammer.equals("보")) {
				System.out.println("게이머 승리 !");
			}
		}
		if(ai.equals("보")) {
			if(gammer.equals("가위")) {
				System.out.println("게이머 승리 !");
			}
			if(gammer.equals("바위")) {
				System.out.println("인공지능 컴퓨터 승리 !");
			}
			if(gammer.equals("보"))
			{
				System.out.println("비겼습니다");
			}
		}
		
		
		
		
		
		
		
		
		//Q4
		int[] num = new int[6];
		for(int i = 0; i < 10000; i++) {
			int ran = (int)(Math.random()*6 + 1);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
