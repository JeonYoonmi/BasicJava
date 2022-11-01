package z_extra;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 30);
		map.put("이순신", 25);
		map.put("신용권", 15);
		map.put("이순신", 30);
		
		System.out.println(map.get("이순신"));
		System.out.println(map.size());
		//map은 키는 중복되면 안되지만 value는 중복되도 괜찮음
		//대신 키가 같은면 나중에 실행되는 것이 덮어씀
		
		HashMap<Integer, Score> students = new HashMap<Integer, Score>();
		//위에서는 value값을 하나만 넣을 수 있지만 value 위치에 class를 넣으면 여러개로 가능은 함.
		students.put(1234, new Score("전윤미", 50, 60, 70, 80, 90, 100, 40));
		students.put(2345, new Score("김수원", 80, 90, 100, 60, 50, 40, 70));
		System.out.println(students.get(2345).getSoc());
		
		//key 집합
		Set<Integer> keySet = students.keySet(); //중복된 값이 없음
		for (int i : keySet) {
			System.out.println(i);
		}
		
		//values
		Iterable<Score> values = students.values(); //iterator //Collection이 Iterable을 상속 받았기 떄문에 뭘 쓰든 상관은 없음
		for (Score score : values) {
			
		}
		
		//(key + value) 집합
		Set<Entry<Integer,Score>> entrySet = students.entrySet(); //중복되어있지 않음
		
		
		
		
		
		
		
		
		
		
	}

}
