package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산자: +, -, *, /, %(나머지) -> 몫을 구하는 것이 아님
		 * - 복합연산자: +=, -+, *=, /=, %=
		 * - 증감연산자: ++, -- -> 변수에 들어있는 값을 1 증가 또는 감소
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60; //연산의 순서: *, / >> +, -
		
		
		//나머지 연산자
		result =10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행한 후 결과를 출력하시오
		int h = 1222 + 427;
		int j = 19991222 - 19940427;
		int k = 59 * 29;
		int l = 221 / 17;
		int n = 1220 % 919;
		
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(n);
		
		//복합연산자
		result = result +3;
		System.out.println(result);
		
		result += 3;
		System.out.println(result);
		
		result -= 5;
		
		result *= 2;
		
		result /= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어 주세요.
		//result = result + 10;
		result += 10;
				
		//result = result % 5;
		result %= 5;
		
		//result = result - 2 * 3;
		result -= 2*3;
		
		//증감연산자
		//증가연산자(++): 변수의 값을 1 증가시킨다.
		//감소연산자(--): 변수의 값을 1 감소시킨다.
		
		int i = 0;
		
		++i; //전위형: 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형: 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다. -> 이항연산자: 피연산자가 두개
		int _int = 10;
		double _double = 3.14;
		//double result2 = _int + _double; //자동 형변환이 안된다.
		double result2 = _int + (int)_double;
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //컴퓨터가 4바이트 이상의 크기가 아니면 연산을 하지 않는다 >> byte, short가 int로 형변환이 된다.
		char _char = 'a'; //컴퓨터에서 문자에 대응하는 숫자가 십진수로 저장 되어있다. a:97, b:98
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 떄 발생하는 현상
		//가장 큰값을 벗어나면 그 숫자에 +1 한 후 음수를 만들자, 가장 작은값을 벗어나면 그 숫자에 -1을 한 후에 양수를 만들자 
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//다음을 한 줄씩 계산해서 최종결과 값을 출력해주세요
		//1. 123456 + 654321
		//2. 1번의 결과 값  * 123456
		//3. 2번의 결과 값  / 123456 
		//4. 3번의 결과 값 - 654321
		//5. 4번의 결과 값 % 123456
		
		long res = 123456 + 654321;
		res *= 123456;
		res /= 123456;
		res -= 654321;
		res %= 123456;
		System.out.println(res);
		
		
		//3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0; //3.0으로 한 이유: 그냥 3으로 나누게 되면 소숫점이 안나옴. sum도 int고 3도 int이기 떄문에 int값이 나와서 둘 중  하나는 double 타입이어야 한다.
		System.out.println(avg);
	
		//반올림
		avg = Math.round(avg * 10) / 10.0; //Math.round는 long타입이기 때문에 실수타입으로 나누어 주어야 한다 
		System.out.println(avg);
		
		//랜덤
		//Math.random() : 0.0 ~ 1.0미만
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
	}

}