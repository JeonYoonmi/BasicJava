package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean을 허용한다.
		 * 비교연산자를 연결하는데에 사용
		 * 논리연산자보다 비교연산자가 우선순위
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		
		b = !(x < y);
		System.out.println(b);
		
		//효율적 연산
		b = true && true; //true //왼쪽에서부터 실행, 왼쪽이 false이면 오른쪽 실행 안함.
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true //왼쪽에서부터 실행, 왼쪽이 true면 오른쪽 실행 안함.
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		int a = 10;
		b = a < 5 && 0 < a++; //10<5가 아니므로 뒤에 a++이 실행되지 않는다. 즉 a값은 그대로.
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
		
		//2. x가 짝수이고 y보다 작거나 같다.
		b = x % 2 == 0 && x <= y;
		
		//3. x가 3의 배수이거나 5의 배수이다.
		b = x % 3 == 0 || x % 5 == 0;
		
		
		
		
		
		
		
	}

}
