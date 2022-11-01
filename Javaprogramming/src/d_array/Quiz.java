package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		//거스름돈 동전 개수 구하기
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("거스름돈: " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈: 2860원
		 * 500원: 5개
		 * 100원:3개
		 * 50원: 1개
		 * 10원: 1개 		 
		 */
		
		for(int i = 0; i < coin.length; i++) {
			int count = money / coin[i];
			money %= coin[i];
			System.out.println(coin[i] + "원: " + count + "개");
		}
		
		
//		for(int i = 0; i < coin.length; i++) {
//			int m = money / coin[i];
//			money -= coin[i] * m; 
//			
//			System.out.println(coin[i] + "원: " + m + "개");
//		}
		
		
//		int m = money / coin[0];
//		money -= coin[0] * m; 
//		System.out.println("500원: " + coin[0]);
//		coin[1] = money / coin[1];
//		money -= coin[1] * m;
//		System.out.println("100원: " + coin[1]);
//		coin[2] = money / coin[2];
//		money -= coin[2] * m;
//		System.out.println("50원: " + coin[2]);
//		coin[3] = money / coin[3];
//		money -= coin[3] * m;
//		System.out.println("10원: " + coin[3]);
		
				
				
		//그래프 그리기
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 각 숫자가 발생된 개수만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * [4, 2, 5, 4, 4, 1, 5, 4, 3, 4, 5, 5, 1, 4, 4, 5, 1, 5, 3, 3]
		 * 1: *** 3
		 * 2: * 1
		 * 3: *** 3
		 * 4: ******* 7
		 * 5: ****** 6
		 */
		
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(i + 1 + " : ");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + count[i]);
		}
		
		
//		int[] count = new int[5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 1) {
//				count[0]++;
//			}
//			if(arr[i] == 2) {
//				count[1]++;
//			}
//			if(arr[i] == 3) {
//				count[2]++;
//			}
//			if(arr[i] == 4) {
//				count[3]++;
//			}
//			if(arr[i] == 5) {
//				count[4]++;
//			}
//		}
//		
//		for(int i = 0; i < count.length; i++) {
//			System.out.print((i+1) + ": ");
//			for(int j = 0; j < count[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" " + count[i]);
//		}
		
		
//		int[] count = new int[5];
//
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < count.length; j++) {
//				if(arr[i] == j + 1) {
//					count[j]++;
//				}
//			}
//		}
//		
//		for(int i = 0; i < count.length; i++) {
//			System.out.print((i+1) + ": ");
//			for(int j = 0; j < count[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" " + count[i]);
//		}
		
		
		//중복된 값이 제거된 배열 만들기
		arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5 사이의 랜덤한 값이 10개 자동 저장된 배열에서 중복된 값이 제거된 배열을 만들어 주세요.
		 * [1, 4, 2, 5, 5, 5, 2, 2, 3, 1]
		 * [4, 1, 3, 2]
		 */
		
		int[] temp = new int[5];
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					flag = false;
				}
			}
			if(flag) {
				temp[cnt++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		
		int[] result = new int[cnt];
		for(int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
		
//		int cnt = 0;
//		int[] temp = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			boolean flag = true;
//			for(int j = 0; j < temp.length; j++) {
//				if(arr[i] == temp[j]) {
//					flag = false;
//					System.out.println(Arrays.toString(temp));
//				}
//			}
//			if(flag) {
//				temp[cnt++] = arr[i];
//			}
//		}
//		int result[] = new int [cnt];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = temp[i];
//		}
//		System.out.println(Arrays.toString(result));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
