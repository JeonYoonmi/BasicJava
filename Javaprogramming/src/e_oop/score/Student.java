package e_oop.score;

public class Student {
	//메인 매소드 없음
	//class는 데이터
	//프로그램을 나누기 위해서 class를 정의
	//한개의 매소드에 모든 프로그램을 다 떄려 넣으면 어떤거 하나를 수정할 때에 어디에 어떻게 영향이 가는지 모른다.
	/*
	 * class 이력서 => 이름이라는 데이터와 나이라는 데이터를 합친 새로운 데이터
	 * 
	 * String 이름  => 데이터
	 * int 나이 => 데이터
	 * 
	 */
	
	//전역변수 => 클래스 전체에서 사용할 수 있다.
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;

		//매소드1
		public static void main(String[] args) {
			int a = 0; //지역변수 => 지역변수는 이 매서드 범위 안에서만 사용이 가능
			
		}
		
		//매소드2
		void a() {
			
		}//전역변수는 쓸 수 있고, 지역변수는 쓸 수 없음
		
		//매소드3
		void b() {
			
		}//전역변수는 쓸 수 있고, 지역변수는 쓸 수 없음
		
} //학생 1명을 표현하는 클래스

