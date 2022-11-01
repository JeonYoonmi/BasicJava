package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 */
		
		int [] array;//배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. => int를 저장할 수 있는 5칸짜리 공간이 만들어진다. , new는 참조형 타입을 초기화 할 때 사용
		//배열 초기화시 기본값이 저장된다. => int 기본값 0이므로 0이 저장되어 있는 상태
		
		/*
		 * 변수 = 100번지(주소)
		 * 
		 * 100번지 => 배열의 첫번째 주소, 그 다음부터는 101번지, 102번지, ---
		 * {0, 0, 0, 0, 0,}
		 */
		
		array = new int[] { 1, 2, 3, 4, 5}; //배열이 길이를 정하는 것이 아니라 넣고 싶은 것을 넣음. => 5칸짜리 배열이 만들어지는데 그 안의 값은 1,2,3,4,5이다.
		
//		array = {1, 2, 3, 4, 5};
		
		int[] array2 = {1, 2, 3, 4, 5}; //new 생략 가능, 선언과 초기화를 동시에 진행
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		//[]: 인덱스
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//배열은 인덱스와 함꼐 for문과 사용한다.
		
		for(int i = 0; i < array.length; i++) { //i <= 4가 아닌 i < 5를 사용한다. => 배열의 길이가 5이기 때문, 따라서 5 대신 array.length를 사용한다.
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println("합계: " + sum + " / " + "평균: " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int M = arr[0];
		int m = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(M < arr[i]) {
				M = arr[i];
			}
			if(m > arr[i]) {
				m = arr[i];
			}
		}
		System.out.println("최대값: " + M + " / " + "최소값" + m);
		
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열에 있는 숫자들을 랜덤하게 섞기
		for (int i = 0; i < shuffle.length * 10; i++) {
			int random = (int) (Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
			}
		System.out.println(Arrays.toString(shuffle));	
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] counts = new int[10];

		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 10 + 1);

			counts[random - 1]++;
		}
		System.out.println(Arrays.toString(counts));
				
//		int[] random = new int[500];
//		int[] count = new int[10];
//		for (int i = 0; i < 500; i++) {
//			random[i] = (int) (Math.random() * 10 + 1);
//
//			for (int j = 1; j < 11; j++) {
//				if (random[i] == j) count[j - 1]++;
//			}
//		}
//		System.out.println(Arrays.toString(count));
//		System.out.println("1:" + count[0] + "개/" + "2:" + count[1] + "개/" +"3:" + count[2] + "개/" +"4:" + count[3] + "개/" +"5:" + count[4] + "개/" +"6:" + count[5] + "개/" +"7:" + count[6] + "개/" +"8:" + count[7] + "개/" +"9:" + count[8] + "개/" +"10:" + count[9] + "개");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
