package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입(class)
		 * - 서로 다른타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		
		
		//기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
		//배열
		int[] scores;
		int sum2;
		double avg2;
		
		//클래스
		//객체생성: 클래스의 내용을 메모리에 올리는 것
		//클래스를 생성할 때에는 그 안에 클래스와 같은 이름의 클래스가 존재하여야 한다.
		Student student = new Student(); // 그냥 변수
		
		student.kor = (int)(Math.random() * 101);
		student.eng = (int)(Math.random() * 101);
		student.math = (int)(Math.random() * 101);
		student.sum = student.kor + student.eng + student.math;
		student.avg = Math.round(student.sum / 3.0 * 100) / 100.0;
		
		System.out.println("sum: " + student.sum + " / avg: " + student.avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
}






















