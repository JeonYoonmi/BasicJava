package z_extra;

import java.util.Arrays;
import java.util.Collection;

public class MyExample {

	
	
	private static Arrays arrays;
	public static void main(String[] args) {

//		Arrays arrays = new Arrays(); //private라서 호출할 수 없음.
		arrays.sort(args); //메소드를 호출하려면 기본적으로 호출을 이렇게 해야함
		
		Arrays.sort(args);
		//sort라는 메소드가 static이 붙어있는데 이런 경우 자바를 실행 했을 때 method area에 정보가 올라가 있다.
		//원래는 사용하려면 메모리에 올라가야 사용할 수 있음.
		
		int a = 10; //기본타입 //stack에 10이라는 값이 저장되어 있음
		String b = "A"; //참조타입 => 클레스는 참조타입이라 대문자로 써야함. //stack에 A가 저장되어있는 주소값이 저장되어 있음
		String c = "A"; //참조타입이니까 이 A라는 값을 가지고 있는 것이 아니라 실제 위치 주소 값만 저장되어있음 //stack에 A가 저장되어있는 주소값이 저장되어 있음
		//그런데 b, c가 같으면 같은 주소로 저장되어 있음
		//그러나 아래의 방식으로 쓰면 주소 여러개에 같은 내용이 저장되어 있는 것임.
		String d = new String("A"); //원칙적으로 이렇지만 쓰면 안된다. => 데이터를 낭비하는 일 => 그래서 위에처럼 씀. //stack에 A가 저장되어있는 주소값이 저장되어 있음
//		Random r = new Random();
		
		System.out.println(b == c);
		System.out.println(b == d);
		
		boolean flag;//이랗게위에서 선언해주면 아래에선 쭉 사용할 수 있다. //flag는 stack에 아무것도 저장되어 있지 않음
		if (b == c) {
//			boolean flag = false;// { } 블럭이 끝나는 순간 flag는 사라짐. 못씀
			flag = false;
			int aab = 10; //stack에 저장되어 있다가 {}가 끝나면 사라짐.
		}else {
//			boolean flag = true;//그래서 여기에서도 flag가 선언되어야 한다.
			flag = true;
		}
		
		
	}

}
