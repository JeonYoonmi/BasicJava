package z_codingTest.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoCenter {
	Random rnd = new Random();
	
	int[] matchLotto = new int[6];
	int bonusNumber = 0;
	
	
	public int checkLotto(int[][] lottoPaper) {
		int reward = 0;
		matchLotto = getLotto();
		bonusNumber = getBonusNumber();
		System.out.println("----------당첨 확인----------");
		System.out.println("이번회차 당첨번호: " + Arrays.toString(matchLotto) + " (보너스:" + bonusNumber + ")");
		for(int i = 0; i < lottoPaper.length; i++) {
			int matchCount = 0;
			System.out.print("[");
			for(int j = 0; j < lottoPaper[i].length; j++) {
				boolean check = false;
				if(j > 0) System.out.print(",\t");
				for(int k = 0; k < matchLotto.length; k++) {
					if(lottoPaper[i][j] == matchLotto[k]) check = true;
				}
				if(check) {
					System.out.print("(" + lottoPaper[i][j] + ")");
					matchCount++;
				}else {
					System.out.print(lottoPaper[i][j]);
				}
			}
			System.out.print("]\t=>");
			switch(matchCount) {
			case 6:
				System.out.println("1등!");
				break;
			case 5:
				boolean check = false;
				for(int j = 0; j < lottoPaper[i].length; j++) {
					if(check) {
						System.out.println("2등");
					}else {
						System.out.println("3등");
					}
				}
				break;
			case 4:
				System.out.println("4등");
				break;
			case 3:
				System.out.println("5등");
				break;
			default:
				System.out.println();
				break;
		}
		}
			return reward;
	}
	
	public int getBonusNumber() {
		int number = 0;
		boolean check = true;
		do {
			number = rnd.nextInt(45) + 1;
			for(int i = 0; i < matchLotto.length; i++) {
				if(matchLotto[i] != number) {
					check = false;
				}
			}
		}while(check);
		return number;
	}
	
	public int[] getLotto() {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) i--;
			}
		}
		return bubbleSort(lotto);
	}
	
	public int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		return arr;
	}
	

}
