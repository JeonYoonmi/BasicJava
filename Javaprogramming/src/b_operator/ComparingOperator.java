package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교: equals()
		 */
		
		
		int x = 10;
		int y = 20;
		boolean b = x < y;
		System.out.println(b);
		
		b = x <= y - 15;//비교연산보다 산술연산을 먼저 수행
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "ABC";
		
		b = str1 == str2; //주소를 비교
		b = str1.equals(str2); // 내용을 비교, Boolean타입으로 결과를 보여준다.
		b = !str1.equals(str2); //!: NOT의 의미

		//다음의 문장들을 코드로 작성해주세요.
		//x는 y보다 작거나 같다.
		b= x <= y;
		
		//x + 5와 y는 같디.
		b = x + 5 == y;
		
		//y는 홀수이다.
		b = y % 2 == 1;
		
		//"기본형"과 "참조형"은 다르다.
		b= !"기본형".equals("참조형");
	}

}













