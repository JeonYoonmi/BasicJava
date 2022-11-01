package z_extra;

import java.util.Objects;

public class Member {

	private String name;
	private int age;
	
	//필드에 초기화 할 수 있는 생성자 3가지.
	
	
	public Member() {
		
	}//ctrl + shift + enter

	//alt + shift + s ->  field
	//전체 선택 : ctrl + a
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//alt + shift + s : hashCode() and equals()
	//옵션 선택 : 밑에서부터 3개
	//객체를 비교할 때 두개가 짝으로 있어야 하므로 함께 있음
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Member)) {
//			return false;
//		}
//		Member other = (Member) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}// 나이와 이름이 같으면 같다고 함
	
	
	//이름만 체크
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(name, other.name);
	}//이름이 같으면 같다고함

	//alt + shift + s -> toString()
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	

	

	
}
