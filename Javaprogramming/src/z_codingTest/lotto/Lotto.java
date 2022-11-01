package z_codingTest.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("로또를 1~50개 자동번호로 구매하고 당 회차 번호를 맞춘 상금을 출력해봅시다.");
		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		LottoShop ls = new LottoShop();
		LottoCenter lc = new LottoCenter(); 
		
		int[][] myLotto = null;
		
		mainWhile:
		while(true) {
			System.out.println("============================로또 판매점============================");
			System.out.println("1. 로또 구입\t2. 내번호 보기\t3. 당첨 확인");
			System.out.println("===============================================================");
			System.out.print("원하는 메뉴 선택 >> ");
			int input = sc.nextInt();
			
			System.out.println();
			System.out.println();
			
			switch(input) {
			case 1: 
				int num = 0;
				while(num == 0) {
					System.out.println("--------------로또 구입--------------");
					System.out.println("몇 장을 구입하시겠습니다? >> ");
					num = sc.nextInt();
					if(num <= 0 || num > 51) {
						num = 0;
						System.out.println("잘못 입력하였습니다.");
					}
				}
				
				myLotto = new int[num][6];
				
				for(int i = 0; i < num; i++) {
					myLotto[i] = ls.buyLotto();
				}
				
				System.out.println(num + "개 구매 완료!");
				break;
			case 2:
				if(myLotto == null) {
					System.out.println("로또를 구매하지 않았습니다.");
				}else {
					System.out.println("---------------내 번호---------------");
					for(int i = 0; i < myLotto.length; i++) {
						System.out.println(Arrays.toString(myLotto[i]));
					}
				}
				break;
			case 3:
				if(myLotto == null) {
					System.out.println("로또를 구매하지 않았습니다.");
				}else {
					lc.checkLotto(myLotto);
					myLotto = null;
				}
				break;
			default:
				System.out.println("잘못 입력하였습니다.\n");
				break;
			}
		}
		
	}

}
