package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

import d_array.Array;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collection Framework => 인터페이스(부모의 역할)
		 * - List -> ArrayList
		 * - Map -> Hash
		 * - Set
		 * 
		 * ArrayList의 주요 메서드 (배열처럼 생겼지만 길이를 정하지 않고 유동적으로 늘거나 줄어들 수 있다.)
		 * //파라미터가 하나이면 마지막 위치에 객체를 추가한다. 파라미터가 두개인 경우 첫번째 파라미터값이 두번째 파라미터 위치에 저장되고 원래 있는 값은 뒤로 한칸씩 밀려난다.
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * - Object set(int index, Object obj) : 지정된 위히에 객체를 저장 후 기존 객체를 반환한다. -> Object는 리턴 값
		 * - Object get(int index) : 지정된 위치에 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다. -> 배열의 길이 length대신 사용
		 * - Object remove(int index) : 지정된 위치에 객체를 제거한다. -> 제거된 객체는 리턴해준다.
		 */
		
		ArrayList sample = new ArrayList<>();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		//아무거나 저장할 수 있음 => 객체, 숫자, 문자 가능, 오브젝트를 리턴하기 떄문에 오브젝트가 가지고 있는 어떠한 것들은 다 가능
		
		//꺼냈을 떄 어떤게 나올지 모른다는 것이 문제.
		//<> 안에 있는것이 제네릭: 어떤 값을 저장할 것인지 정해주는 것
		ArrayList<Integer> list = new ArrayList<Integer>();
		//이제 여기있는 ArrayList는 인트값만 사용할 수 있는데 인트값 자체를 저장할 수 있지만 갹체만 넣을 수 있기 떄문에 인티저라는 클래스를 만들어서 넣는다
		list.add(10); //이렇게도 사용가능 => 자동 형변환이 된다.
//		list.add("abc");
		
		list.add(new Integer(10)); //원래 방법
		
		/*
		 * Wrapper Class
		 * - byte: Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - boolean : Boolean
		 * - char : Character
		 */
		
		System.out.println(list.add(30)); //불린타입으로 저장을 했는지 안했는지 알려줌 저장하면 true
		
		//1번 인덱스에 40이라는 값을 저장,
		list.add(1, 40); //1번인덱스부터 뒤로 밀고 값을 저장한다
		
		System.out.println(list); //Arrays.toString()을 쓰지 않아도 된다.
		
		//주의: 인덱스의 현제 범위를 벗어나면 안된다.
//		list.add(5, 50); //인덱스의 범위를 벗어나서 저장 할 수 없다.
		
		Integer before = list.set(2, 50); //인덱스에 이전에 있던 값을 리턴시켜준다.
		System.out.println("before : " + before); //이전에 있던 값 출력
		System.out.println(list); // 2번 인덱스에 새로운 값이 저장된채로 출력
		
		
		int get = list.get(2); //인덱스에 해당하는 값을 출력해준다. 이 값도 역시 인테저 타입이지만 자동으로 형변환이 되기 때문에 인트라고 써도 된다.
		System.out.println(get);
		
		
		for(int i = 0; i < list.size(); i++) {//length()를 사용할 일은 거의 없음 이제는 size()로 기억해야힌다.
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list); //전부다 삭제되지 않고 두개만 삭제 됨.
		//ArrayList는 빈공간을 허용하지 않음
		//0번 인덱스가 사라지면서 1번인덱스에 있는 값이 0번으로 오게 되고 2번 인덱스에 있는 값이 사라지게 되면서 장검다리로 사라짐
		
		//그래서 뒤에부터 삭제해야 다 삭제가 된다.
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		//list에 1~100사이의 랜덤값을 10개 저장해주세요
		for(int i =0; i < 10; i++) {			
			int random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		double avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / " + "avg : " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int max = list.get(0);
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("max : " + max + " / " + "min : " + min);

		// list를 오름차순으로 정렬해주세요
		for (int i = 0; i < list.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
//			int temp = list.get(i);
//			list.set(i, list.get(min));
//			list.set(min, temp);
			list.set(min,  list.set(i,  list.get(min)));
		}
		System.out.println(list);
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>(); //기존에 있던 ArrayList를 사용허면서 객체를 생성해 사용하는 느낌 list에는 아무 값도 안들어있게 된다
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		
		list = new ArrayList<Integer>();
		list2.add(list);
		
		list.add(40);
		list.add(50);
		list2.get(1).add(60);
		
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			for( int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j));
			}
		}
		
		//학생 3명의 5과목에 대한 0~100점의 랜덤힌 점수를 2차원 ArrayList에 저장해주세요.
		list2 = new ArrayList<ArrayList<Integer>>();
		for (int j = 0; j < 3; j++) {
			list = new ArrayList<Integer>();
			for (int i = 0; i < 5; i++) {
				int random = (int) (Math.random() * 101);
				list.add(random);
			}
			System.out.println(list);
			
			list2.add(list);
			System.out.println(list);
		}
		
		//각 학생별 합계와 평균을 구해주세요.
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		
		for(int i = 0; i < list2.size(); i++) {
			sum = 0;
			for(int j = 0; j < list2.get(i).size(); j++) {
				sum += list2.get(i).get(j);
			}
			sums.add(sum);
			avgs.add((double)sum / list2.get(i).size());
		}
		System.out.println(sums);
		System.out.println(avgs);
		
		
//		for(int i = 0; i < list2.size(); i++) {
//			int sum1 = 0;
//			double avg1 = 0.0;
//			for(int j = 0; j < list2.get(i).size(); j++	) {
//				sum1 +=  list2.get(i).get(j);				
//			}
//			avg1 = (double)sum1 /  list2.get(i).size();
//			System.out.println(i + 1 + "번 째 학생 합계 : " + sum1 + " / " + "평균 : " + avg1);
//		}
		
		
	}
}








