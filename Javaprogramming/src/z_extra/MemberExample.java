package z_extra;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {

		//Object class: 클래스의 가장 부모가 되는 클래스. 클래스를 만들때 항상 상속받고 있지만 생략되어있는 것임.
//		Mem mem = new Mem();
//		mem. 하면 나오는 값들은 Object에서 상속 받아서 나오는 값
		
		
		//hash 단어가 들어간 클래스는 hashCode()로 비교한다.
		//hashSet, hashMap 등등...
		HashSet<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("이순신", 30));
		set.add(new Member("홍길동", 25));
		
		System.out.println(set.size()); //4개 3개 2개
		//같은 데이터는 저장이 안되는 것은 맞지만 각각의 값의 주소가 다르기 떄문에 중복되는 것이 제거되지 않고 인쇄된다.
		//그 말은 주소가 같아야 같은걸로 인식한다.((클래스에서 불러올 경우))
//		Member member1 = new Member("홍길동", 30);
//		set.add(member1);
//		set.add(member1);
//		set.add(member1);
//		set.add(member1);
		//이렇게 하면 값이 한번만 저장된다.
		
		//같은건지 판단하는 Object클래스에 있는 메서드
		
		Mem mem1 = new Mem("홍길동");
		Mem mem2 = new Mem("홍길동");
		System.out.println(mem1);
		System.out.println(mem2);
		if(mem1 == mem2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
