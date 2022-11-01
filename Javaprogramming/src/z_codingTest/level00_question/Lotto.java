package z_codingTest.level00_question;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		/*
		 로또번호를 생성하는 프로그램을 작성하시오.
		(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
		 */
		
//		int[] lotto = new int[6];
//		int count = 0;
//		int ran = (int) (Math.random() * 45) + 1;
//
//		do {
//			for(int j = 0; j < lotto.length; j++) {
//				if (lotto[j] == ran) {
//					ran = (int) (Math.random() * 45) + 1;
//					break;
//				}
//				if (lotto[j] != ran) {
//					lotto[count++] = ran;
//				}
//			}
//		}while(count != 5);
//		
//		System.out.println(Arrays.toString(lotto));
//		
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45 + 1);
//		}
//		for(int i = 0; i < lotto.length - 1; i++) {
//			for(int j = 0; j < lotto.length; j++) {
//				if(lotto[i] == lotto[i + 1]) {
//					lotto[i + 1] = (int)(Math.random()*45 + 1);
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int ran = 0;
			do {
				ran = (int) (Math.random() * 45);
			} while (nums[ran] == 0);
			lotto[i] = nums[ran];
			nums[ran] = 0;
		}
		System.out.println(Arrays.toString(lotto));
		
		

	}

}
