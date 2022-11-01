package z_extra;

import java.util.HashSet;
import java.util.Iterator;

public class setExample {

	public static void main(String[] args) {

		//set: HashSet, TreeSet
		HashSet<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("자바");
		set.add("Java");
		set.add("java");
		set.add("java");
		System.out.println(set.size());
		
		//반복자
		//set에 들어 있는 값들은 하나씩 꺼내서 가지고 오는 것
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//fore + shift + sapce bar
		for (String string : set) {
			System.out.println(string);
		}
			
			
	}

}
