package e_oop.Score2;

public class Score {

	public static void main(String[] args) {
		String[] studentNames = new String[] { "이정후", "은주영", "박다혜", "이다솜", "윤정영"
											, "이가은", "이상학", "신현국", "김은태", "황명성"
											, "이재원", "문승제", "권홍종", "이규범", "안은실"
											, "이희경", "오세영", "김민정", "최민정", "전윤미"
											, "김수원", "이소정", "임정은", "최지은", "최지연"};

		Student[] students = new Student[studentNames.length];

		for (int i = 0; i < students.length; ++i) {
			students[i] = new Student();//25명의 학생의 객체 생성
			
			students[i].name = studentNames[i];
			students[i].createRandomScore();
			students[i].getSum();
			students[i].getAverage();
		}
		
		for(int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		
		for(int  i = 0; i < students.length - 1; i++) {
			boolean changed = false;
			for(int j = 0; j < students.length - i - 1; j++) {
				if(students[j].getSum() < students[j + 1].getSum()) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
		
		//과목별 평균
		double[] sums = new double[3];
		for(int i = 0; i < students.length; i++) {
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		
		double[] avgs = new double[3];
		for(int i = 0; i < avgs.length; i++) {
			avgs[i] = Math.round((double)sums[i] / students.length * 100) / 100.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getInfo());
		}
		
		System.out.print("과목합계");
		for (int i = 0; i < sums.length; i++) {
			System.out.print("\t" + sums[i]);
		}
		
		System.out.print("\n과목평균");
		for (int i = 0; i < avgs.length; i++) {
			System.out.print("\t" + avgs[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < students.length; ++i) {
//			students[i] = new Student();
//			students[i].name = studentNames[i];
//			students[i].kor = (int) (Math.random() * 101);
//			students[i].eng = (int) (Math.random() * 101);
//			students[i].math = (int) (Math.random() * 101);
//			students[i].rank = 1;
//			students[i].sum();
//			students[i].avg();
//		}
//
//		for (int i = 0; i < students.length; ++i) {
//			for (int j = 0; j < students.length; ++j) {
//				students[i].rank(students[i].sum, students[j].sum);
//			}
//		}
//
//		Teacher teachers = new Teacher();
//
//		teachers.sort(students);
//		teachers.subSum(students);
//		teachers.subAvg(teachers.subSum);
//
//		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
//
//		for (int i = 0; i < students.length; ++i) {
//			System.out.println(students[i].name + "\t" + students[i].kor + "\t" + students[i].eng + "\t"
//					+ students[i].math + "\t" + students[i].sum + "\t" + students[i].avg + "\t" + students[i].rank);
//		}
//
//		System.out.print("과목합계");
//		for (int i = 0; i < 3; i++) {
//			System.out.print("\t" + teachers.subSum[i]);
//		}
//		System.out.println();
//		System.out.print("과목평균");
//		for (int i = 0; i < 3; i++) {
//			System.out.print("\t" + teachers.subAvg[i]);
//		}

	}

}


