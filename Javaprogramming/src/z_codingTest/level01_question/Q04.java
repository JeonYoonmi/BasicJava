package z_codingTest.level01_question;

public class Q04 {

	/*
	두 정수 left와 right가 매개변수로 주어집니다.
	left부터 right까지의 모든 수들 중에서,
	약수의 개수가 짝수인 수는 더하고,
	약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	
	1) 1 ≤ left ≤ right ≤ 1000
	
	<< 입출력 예 >>
	1) left = 13, right = 17 ==> result = 43
	2) left = 24, right = 27 ==> result = 52
	*/
	
	public static void main(String[] args) {
		int left1 = 13, right1 = 17;
		int left2 = 24, right2 = 27;
		System.out.println(solution(left1, right1));
		System.out.println(solution(left2, right2));

	}

	private static int solution(int left, int right) {
		int answer = 0;
		return answer;
	}

}
