package z_codingTest.lotto;

import java.util.Random;

public class LottoShop {
	Random rnd = new Random();
		
	public int[] buyLotto() {
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
