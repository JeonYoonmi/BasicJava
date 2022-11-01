package z_codingTest.level01_question;

public class Q05 {

	/*
	자연수 n이 매개변수로 주어집니다.
	n을 3진법 상에서 앞뒤로 뒤집은 후,
	이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	(10진법 n -> 3진법으로 변환 -> 3진법 숫자 뒤집기 -> 10진법으로 변환 -> return)
	
	1) n은 1 이상 100,000,000 이하인 자연수입니다.
	
	<< 입출력 예 >>
	1) n = 45 ==> result = 7
		: 45 -> 1200 -> 0021 -> 7
	2) n = 125 ==> result = 229
		: 125 -> 11122 -> 22111 -> 229
	*/
	
	public static void main(String[] args) {
		int n1 = 45, n2 = 125;
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}

	private static int solution(int n) {
		int answer = 0;
		return answer;
	}

}
