package d_array;
import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤으로 생성하고, 아래와 같이 출력해주세요
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };
		
		int[][] scores = new int [25][7];
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random()*101);
			}
		}
		
		int[] sum = new int[25];
		double[] avg = new double[25];
		for(int i = 0; i < scores.length; i++) {
			for( int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
			avg[i] = (double)sum[i]/scores[i].length;
			avg[i] = Math.round(avg[i]*100)/100.0;
		}
		
		int[] rank = new int[25];
		for(int i = 0; i < avg.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < avg.length; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		int[] subSum = new int[7];
		double[] subAvg = new double[7];
		for(int i = 0 ; i < scores[i].length; i++) {
			for(int j = 0; j < scores.length; j++) {
				subSum[i] += scores[j][i];
			}
			subAvg[i] = (double)subSum[i]/scores.length;
			subAvg[i] = Math.round(subAvg[i]*100)/100.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava");
		
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(students[i]);
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print("\t" + scores[i][j]);
			}
			System.out.print("\t" + sum[i]);
			System.out.print("\t" + avg[i]);
			System.out.println("\t" + rank[i]);
		}
		
		System.out.print("과목합계");
		for(int i = 0; i < scores[i].length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		
		System.out.print("과목평균");
		for(int i = 0; i < scores[i].length; i++) {
			System.out.print("\t" + subAvg[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[][] scores = new int[25][7];
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = (int)(Math.random() * 100);
//			}
//		}
//		
//		int[] sum = new int[25];
//		double[] avg = new double[25];
//		
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				sum[i] += scores[i][j]; 
//			}
//			avg[i] = (double)sum[i] / scores[i].length;
//			avg[i] = Math.round(avg[i] * 100) / 100.0;
//		}
//		
//		int[] rank = new int [25];
//		for(int i = 0; i < avg.length; i++) {
//			rank[i] = 1;
//		}
//		for(int i = 0; i < avg.length; i++) {
//			for(int j = 0; j < avg.length; j++) {
//				if(avg[i] < avg[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		
//		int[] subjectsum = new int[7];
//		double[] subjectavg = new double[7];
//		
//		for(int i = 0; i < scores[i].length; i++) {
//			for(int j = 0; j < scores.length; j++) {
//				subjectsum[i] += scores[j][i];	
//			}
//			subjectavg[i] = (double) subjectsum[i] / scores.length;
//			subjectavg[i] = Math.round(subjectavg[i] * 100) / 100.0;
//		}
//		
//		for(int i = 0; i < scores.length - 1; i++) {
//			int min = i;
//			for(int j = i + 1; j < scores.length; j++){
//				if(rank[j] < rank[min]){
//					min = j;
//				}
//			}
//			String tempname = students[i];
//			students[i] = students[min];
//			students[min] = tempname;
//		
//			for(int k = 0; k < scores[i].length; k++) {
//				int tempscores = scores[i][k];
//				scores[i][k] = scores[min][k];
//				scores[min][k] = tempscores;
//			}
//		
//			int tempsum = sum[i];
//			sum[i] = sum[min];
//			sum[min] = tempsum;
//							
//			double tempavg = avg[i];
//			avg[i] = avg[min];
//			avg[min] = tempavg;
//		
//			int temprank = rank[i];
//			rank[i] = rank[min];
//			rank[min] = temprank;
//		}
//		
//		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
//
//		for (int i = 0; i < scores.length; i++) {
//			System.out.print(students[i]);
//			for (int j = 0; j < scores[i].length; j++) {
//				System.out.print("\t" + scores[i][j]);
//			}
//			System.out.print("\t" + sum[i]);
//			System.out.print("\t" + avg[i]);
//			System.out.println("\t" + rank[i]);
//		}
//
//		System.out.print("과목합계");
//		for (int i = 0; i < scores[i].length; i++) {
//			System.out.print("\t" + subjectsum[i]);
//		}
//		System.out.println();
//
//		System.out.print("과목평균");
//		for (int i = 0; i < scores[i].length; i++) {
//			System.out.print("\t" + subjectavg[i]);
//		}	
		
		
//		for(int i =0; i < scores.length; i++) {
//			for(int j = 0; j < scores.length; j++) {
//				if(rank[i] < rank[j]) {
//					String tempname = students[i];
//					students[i] = students[j];
//					students[j] = tempname;
//					
//					for(int k = 0; k < scores[i].length; k++) {
//						int tempscores = scores[i][k];
//						scores[i][k] = scores[j][k];
//						scores[j][k] = tempscores;
//					}
//										
//					int tempsum = sum[i];
//					sum[i] = sum[j];
//					sum[j] = tempsum;
//										
//					double tempavg = avg[i];
//					avg[i] = avg[j];
//					avg[j] = tempavg;
//					
//					int temprank = rank[i];
//					rank[i] = rank[j];
//					rank[j] = temprank;
//				}
//			}
//		}
//		
//		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
//
//		for (int i = 0; i < scores.length; i++) {
//			System.out.print(students[i]);
//			for (int j = 0; j < scores[i].length; j++) {
//				System.out.print("\t" + scores[i][j]);
//			}
//			System.out.print("\t" + sum[i]);
//			System.out.print("\t" + avg[i]);
//			System.out.println("\t" + rank[i]);
//		}
//
//		System.out.print("과목합계");
//		for (int i = 0; i < scores[i].length; i++) {
//			System.out.print("\t" + subjectsum[i]);
//		}
//		System.out.println();
//
//		System.out.print("과목평균");
//		for (int i = 0; i < scores[i].length; i++) {
//			System.out.print("\t" + subjectavg[i]);
//		}
		
		
		
		
	}

}
