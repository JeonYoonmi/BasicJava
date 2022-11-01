package e_oop.Score2;

public class Teacher {
	
	int[] subSum = new int[3];
	double[] subAvg = new double[3];

	void subSum(Student[] students) {
		for (int i = 0; i < 25; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
	}

	void subAvg(int[] subSum) {
		for (int i = 0; i < 3; i++) {
			subAvg[i] = (double) Math.round((double) subSum[i] / 25.0 * 100) / 100.0;
		}

	}

	void sort(Student[] students) {
		for (int i = 1; i < students.length; ++i) {
			for (int j = 1; j < students.length - (i - 1); ++j) {
				if (students[j - 1].rank > students[j].rank) {
					Student temp = students[j];
					students[j] = students[j - 1];
					students[j - 1] = temp;
				}
			}
		}
	}

}
