package e_oop.Score2;

public class Student {
	// 학생 한 명이 할 수 있는 일을 메서드로 만든다
	// 전역 변수
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;

	//점수 발생
	void createRandomScore() {
		kor = (int) (Math.random() * 101);
		eng = (int) (Math.random() * 101);
		math = (int) (Math.random() * 101);
	}
	
	//합계
	int getSum() {
		return sum = kor + eng + math;		
	}
	
	//평균
	double getAverage() {
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
		//전역변수를 사용하는 이유: sum이라는 메서드가 실행되지 않은 상태에서 이 메서드가 실행되ㅏ는 것을 방지하기 위해서 getSum() 사용
	}
	
	//석차
	int getRank(Student[] students) {
		rank = 1;
		
		for(int i = 0; i < students.length; i++) {
			if(getSum() < students[i].getSum()) {
				rank++;
			}
		}
		return rank;
	}
	
	//출력 데이터 제공
	String getInfo() {
		return name + "\t" + kor + "\t"  + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
	
	
	
	
	
	
	
	
	
//	void sum() {
//		sum = kor + eng + math;
//	}
//
//	void avg() {
//		avg = Math.round((double) sum / 3 * 100) / 100.0;
//	}
//
//	void rank(int stdentSum1, int stdentSum2) {
//		if (stdentSum1 < stdentSum2) {
//			rank++;
//		}
//	}
	
	
}
