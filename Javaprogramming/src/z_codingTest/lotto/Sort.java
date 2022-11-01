package z_codingTest.lotto;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * - 석차구하기: 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택 정렬: 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬: 바로 뒤에 숫자와 비교해서 큰 수 뒤로 보내는 방식
		 * - 삽입정렬: 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수를 뒤로 보내는 방식
		 * 
		 * **현재는 퀵정렬을 사용해서 정렬을 한다.
		 */
		
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));	//오름차순으로 정렬
		
		
		//석차구하기
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//
//		int[] rank = new int[arr.length];
//		for (int i = 0; i < rank.length; i++) {
//			rank[i] = 1; // 모든 사람이 1등으로 시작
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(rank));
		
		
		
		//선택정렬
		/*
		 * i,j
		 * 0,1	0,2	0,3	0,4	0,5	0,6	0,7	0,8	0,9
		 * 1,2	1,3	1,4	1,5	1,6	1,7	1,8	1,9
		 * 2,3	2,4	2,5	2,6	2,7	2,8	2,9
		 * 3,4	3,5	3,6	3,7	3,8	3,9
		 * 4,5	4,6	4,7	4,8	4,9
		 * 5,6	5,7	5,8	5,9
		 * 6,7	6,8	6,9	
		 * 7,8	7,9
		 * 8,9
		 */
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			int min = i; // 최솟값이 들어있는 인덱스를 찾아야 한다.
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//		System.out.println(Arrays.toString(arr));

		//선택정렬은 아님
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i = 0; i < arr.length ; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//버블정렬
		/*
		 * 0,1	1,2	2,3	3,4	4,5	5,6	6,7 7,8	8,9
		 * 0,1	1,2	2,3	3,4	4,5	5,6	6,7 7,8
		 * 0,1	1,2	2,3	3,4	4,5	5,6	6,7
		 * 0,1	1,2	2,3	3,4	4,5	5,6
		 * 0,1	1,2	2,3	3,4	4,5
		 * 0,1	1,2	2,3	3,4
		 * 0,1	1,2	2,3
		 * 0,1	1,2
		 * 0,1
		 */
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));

		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length - (i-1); j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j - 1] = temp;
				}
			}
			System.out.println(i + "번 째 정렬" + Arrays.toString(arr));
		}
		
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			boolean flag = true;
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = false;
//				}
//			}
//			if (flag) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
	}

}
