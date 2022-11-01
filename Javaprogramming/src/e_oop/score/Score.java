package e_oop.score;

public class Score {
//이 클래스에는 변수가 없다
	public static void main(String[] args) {
		//이 아래에 있는 변수는 매서드에 있는 변수
		String[] studentNames = { "이정후", "은주영", "박다혜", "이다솜", "윤정영"
				, "이가은", "이상학", "신현국", "김은태", "황명성"
				, "이재원", "문승제", "권홍종", "이규범", "안은실"
				, "이희경", "오세영", "김민정", "최민정", "전윤미"
				, "김수원", "이소정", "임정은", "최지은", "최지연" };
		
		Student[] students = new Student[studentNames.length];
		//Student는 한명의 정보만 저장해줄 수 있기때문에 학생수 길이만큼의 배열을 만들어 준다.
		
		//참조형 타입의 기본값: null => 기본적으로 정의되어있는 타입들이 아니면 다 참조형 타입이다.
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(); //실제 쓸 수 있는 배열을 만듬
			
			//배열에 필요한 값들을 넣어줌
			students[i].name = studentNames[i];
			students[i].kor = (int)(Math.random() * 101);
			students[i].eng = (int)(Math.random() * 101);
			students[i].math = (int)(Math.random() * 101);
			students[i].rank =1;
			
			//합계, 평균
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
				
		// 석차
		//위에 for문 안에서 구할 수 없음
		//힙계평균은 3과목의 점수가 for문 안에서 저장되기 때문에 가능
		//석차는 학생마다의 점수가 다 저장 된 후에 구할 수 있기 떄문에 for문 밖에다가 저장
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				/*
				 * if(student[i].sum < students[j].sum) {
				 * 		student[i].rank++
				 * }
				 */
				if (students[i].avg < students[j].avg) {
					students[i].rank++;
				}
			}
		}
				
		//석차순 정렬
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
		
		//과목별 합계
		//학생 한 명과 과목별 평균은 상관관계가 없고 학생 25명과 과목별 평균이 관련이 있으므로 Student 안에 변수를 지정해주는 것이 아니라 여기에서 직접 만들어준다.
		int[] subSum = new int[3];
		for(int i = 0; i < students.length; i++) {
				subSum[0] += students[i].kor;
				subSum[1] += students[i].eng;
				subSum[2] += students[i].math;
		}
		
		//과목별 평균
		double[] subAvg = new double[3]; 
		for(int i = 0; i < subSum.length; i++) {
			subAvg[i] = Math.round((double) subSum[i] / students.length * 100) / 100.0;
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" 
					+ students[i].kor + "\t" 
					+ students[i].eng + "\t" 
					+ students[i].math + "\t" 
					+ students[i].sum + "\t" 
					+ students[i].avg + "\t" 
					+ students[i].rank);
			
		}
		
		System.out.print("과목합계");
		for(int i = 0; i < 3; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		
		System.out.print("과목평균");
		for(int i = 0; i < 3; i++) {
			System.out.print("\t" + subAvg[i]);
		}

	}
}


