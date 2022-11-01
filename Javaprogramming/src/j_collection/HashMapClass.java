package j_collection;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;


public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다. //키와 값이 둘다 삭제된다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다. 
		 * Set KeySet() : 저장된 모든 키를 Set으로 반환한다.
		 */

		//ArrayList와 저장방식이 다름
		//ArrayList는 배열 형태라서 인덱스를 사용 하는데 그 대신 key를 사용
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		//키와 값을 저장해야 하기 때문에 제네릭 안에 값이 두개여야 한다
		//제네릭을 사용하는 이유는 저장할 때는 괜찮은데 꺼낼 때 어떤 타입인지 모르니까 정확하게 정하기 위해서
		//그래서 제네릭 안에는 정확한 타입을 써야함.
		//<key, value>
		//그러나 HashMap은 object타입을 사용하는 경우도 많음 
		
		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());
		//처음에 컴파일 에러가 뜨는데 그 이유는 임포트가 안되어있기 때문
		//import(ctrl + shift + o)하면 선택지가 2개인데 그 이유는 Date의 종류가 두가지 이기 떄문인데 여기서는 java.util에 있는 걸로 가지고 올거임.
		
		System.out.println(map);
		//우리가 저장한 순서로 저장되어 있지 않음
		//HashMap에는 인덱스가 존재하지 않기 때문에 순서라는 개념이 없다.
		
		//값을 수정하고 싶을 때
		map.put("name", "이순신"); //같은 키로 다시한번 저장 -> 기존에 있던 값을 덮어씀
		
		System.out.println(map);
		
		//값을 제거
		map.remove("age"); //파라메터로 키를 넣어주면 키에 해당하는 값이 제거됨.
		
		System.out.println(map);
		
		Object value = map.get("name");
		System.out.println(value);
		
		//map은 값의 제네릭을Object로 설정
		//Object는 꺼내면 타입이 Object이기 때문에 Object 타입으로 뭘 할 수가 없음
		//실제로 꺼낸 객체가 Object타입이 아니다
		//예) 이름은 실제 객체 값은 String
		//타입이 Object면 Object에 있는 변수나 메서드만 사용할 수 있어서 실제 객체의 타입에 있는 메서드를 사용하고 싶을 수 있음
		
		//형변환 방법
		//1
//		(String)value.substring(1,2); //value를 형변환을 한 것이 아니라 value.subString(1,2) 전체가 형변환됨
		((String)value).substring(1,2);
		
		//2
		String str = (String)map.get("name");
		
		//꺼낸 값이 String이라는 가정하에 이렇게 쓴거고 String타입이 아닌데 사용하면 에러가 난다.
		//따라서 타입이 확실 할 때 사용해야한다.
		
		
		Set<String> keys = map.keySet(); //key를 String타입으로 저장해주었기 때문에 String으로 설정
		//중복된 값은 저장되지 않는다.
		//문제점 : set자체가 값을 꺼내는 메소드가 존재하지 않음. list나 map은 set이 있음
		//Iterator를 사용해서 꺼낸다.
		
//		Iterator<String> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
//		
//		//fore + shift + sapce bar
//		for (String string : set) {
//			System.out.println(string);
//		}
		
		//향상된 for문도 가능
		for(String key : keys) { //for(값을 저장할 변수 : 배열)
			System.out.println(key + " : " + map.get(key));
		}
		
		//사용하는 이유
		//테이블 구조를 만들기 위해서 사용
		
		//예1
		ArrayList<Dept> deptTable = new ArrayList<Dept>();
		//장점 : 클래스를 만드는 방법은 테이블의 구조를 쉽게 파악할 수 있다.
		//단점 : 테이블의 개수가 많아지면 테이블의 개수만큼 클래스를 만들어 줘야한다.
		//주로 중요한 테이블을 만드는데 사용한다. => 회원테이블
		
		//예2
		ArrayList<HashMap<String, Object>> table = new ArrayList<HashMap<String, Object>>();
		//장점 : 이거 하나로 모든 테이블을 만들 수 있다.
		//단점 : 테이블안에 어떤 컬럼이 들어있는지 내용을 한번에 알아볼 수 없고, 인쇄를 해야지만 가능하다.
		//중요한 테이블 외에는 이 방법으로 테이블을 만든다.
		HashMap<String, Object> row = new HashMap<String, Object>();
		row.put("DEPTNO", 10);
		row.put("DNAME", "ACCOUNTING");
		row.put("LOC", "NEWYORK");
		
		table.add(row);
		
		row = new HashMap<String, Object>();
		row.put("DEPTNO", 20);
		row.put("DNAME", "RESEARCH");
		row.put("LOC", "DALLAS");
		
		table.add(row);
		System.out.println(table);
		
		for(int i = 0; i < table.size(); i++) {
			row = table.get(i);
			//하나씩 지정해서 출력
			System.out.println(row.get("DEPTNO"));
			System.out.println(row.get("DNAME"));
			System.out.println(row.get("LOC"));
			for(String key : row.keySet()) {
				System.out.println(i + " : " + key + " / " + row.get(key));
			}
			System.out.println("---------------------------------------------");
		}
		
		ArrayList<HashMap<String, Object>> DepartTable = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "401");
		row1.put("DEP_NAME", "12월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "402");
		row1.put("DEP_NAME", "9월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "403");
		row1.put("DEP_NAME", "12월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "404");
		row1.put("DEP_NAME", "1월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "405");
		row1.put("DEP_NAME", "2월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "406");
		row1.put("DEP_NAME", "3월반");
		DepartTable.add(row1);
		
		row1 = new HashMap<String, Object>();
		row1.put("DEP_CODE", "307");
		row1.put("DEP_NAME", "4월반");
		DepartTable.add(row1);
		
		for (HashMap<String, Object> table1 : DepartTable) {
			System.out.println(table1);
		}
		
	}

}

//예
class Dept{
	int deptNo;
	String dname;
	String loc;	
}
