package z_codingTest.level00_question;

public class GetMaxMin {

	public static void main(String[] args) {
		/*
		다음 배열에서 최댓값과 최솟값을 구하시오.
		{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		*/
		
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

	}

}
