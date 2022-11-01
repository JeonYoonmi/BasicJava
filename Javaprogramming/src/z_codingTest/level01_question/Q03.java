package z_codingTest.level01_question;

import java.util.Arrays;

public class Q03 {

	/*
	정수 배열 numbers가 주어집니다. 
	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
	배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	
	1) numbers의 길이는 2 이상 100 이하입니다.
	2) numbers의 모든 수는 0 이상 100 이하입니다.
	
	<< 입출력 예 >>
	1) numbers = [2,1,3,4,1] ==> result = [2,3,4,5,6,7]
	2) numbers = [5,0,2,7] ==> result = [2,5,7,9,12]
	 */
	
	public static void main(String[] args) {
		int[] numbers1 = {2,1,3,4,1};
		int[] numbers2 = {5,0,2,7};
		System.out.println(Arrays.toString(solution(numbers1)));
		System.out.println(Arrays.toString(solution(numbers2)));
	}

	private static int[] solution(int[] numbers) {
		int[] answer = {};
		return answer;
	}

}
