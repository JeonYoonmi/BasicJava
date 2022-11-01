package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		/*
		 * 기타연산자
		 * - 비트연산자: |. &, ^, ~, <<, >>
		 * - 참조연산자(.): 특정범위 내에 속해있는 멤버를 지칭할 때 사용한다.
		 * - 삼항연산자(?:): 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건이 거짓일 경우 수행할 문장   >> 결과는 boolean 타입이고 둘 중 하나만 시행
		 */
		
		//1 byte: 01010101(0 혹은 1로 이루어진 8자리 수 = 8개의 비트)
		
		System.out.println(10 | 15); //|: 둘다 0인 경우 0 그외 1
		//10: 00001010
		//15: 00001111
		//    00001111
		
		
		System.out.println(); //여기에서 .이 참조연산자, System 안에 있는 out을 찾을 떄 .을 붙인다.
		
		
		int x = 10;
		int y = 20;
		int result = x > y ? x : y;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번 째 숫자가 1이면 남자 2면 여자
		int regNo = 2;
		String gender = regNo == 1 ? "남자" : "여자"; // 1경우만 확인이 가능하고 나머지 숫자는 다 여자라고 나오데 된다.
		System.out.println(gender);
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가"); // 1, 2 모두 확인하고 싶을 때
		
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력하시오.
		Scanner s = new Scanner(System.in);
		
//		System.out.print("첫번 째 숫자>");
//		int num1 = Integer.parseInt(s.nextLine());
//		System.out.print("두번 째 숫자>");
//		int num2 = Integer.parseInt(s.nextLine());
//		
//		int res = num1 > num2 ? num1 : num2;
//		System.out.println(res);
		
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		//그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		System.out.print("숫자 >");
		regNo = Integer.parseInt(s.nextLine());
		
		gender = regNo == 1 || regNo ==3 ? "남자" : (regNo == 2 || regNo == 4 ? "여자" : "확인불가");		
		
	}

}
