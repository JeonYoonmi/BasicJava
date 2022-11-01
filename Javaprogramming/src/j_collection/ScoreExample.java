package j_collection;

import java.util.ArrayList;
import java.util.Random;

public class ScoreExample {

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
		ArrayList<String> students = new ArrayList<String>();
		students.add("이정후");
		students.add("은주영");
		students.add("박다혜");
		students.add("이다솜");
		students.add("윤정영");
		students.add("이가은");
		students.add("이상학");
		students.add("신현국");
		students.add("김은태");
		students.add("황명성");
		students.add("이재원");
		students.add("문승제");
		students.add("권홍종");
		students.add("이규범");
		students.add("안은실");
		students.add("이희경");
		students.add("오세영");
		students.add("김민정");
		students.add("최민정");
		students.add("전윤미");
		students.add("김수원");
		students.add("이소정");
		students.add("임정은");
		students.add("최지은");
		students.add("최지연");
//		System.out.println(students);
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		for(int i = 0; i < 25; i++) {
			score = new ArrayList<Integer>();
			for(int j = 0; j < 7; j++){
				int random = (int)(Math.random() * 101);
				score.add(random);
			}
			scores.add(score);
		}
//		System.out.println(scores);
		
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();

		for(int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for(int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / scores.get(i).size()*100)/100.0);
		}
//		System.out.println(sums);
//		System.out.println(avgs);
		
		ArrayList<Integer> rank = new ArrayList<Integer>();
		for(int i = 0; i < sums.size(); i++) {
			rank.add(1);
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					rank.set(i, rank.get(i) + 1);
				}
			}
		}
//		System.out.println(rank);
		
		for (int i = 0; i < scores.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < scores.size(); j++) {
				if (rank.get(j) < rank.get(min)) {
					min = j;
				}
			}
			students.set(min, students.set(i, students.get(min)));
			rank.set(min, rank.set(i, rank.get(min)));
			scores.set(min, scores.set(i, scores.get(min)));
			sums.set(min, sums.set(i, sums.get(min)));
			avgs.set(min, avgs.set(i, avgs.get(min)));
		}
		
		
		
		ArrayList<Integer> subSums = new ArrayList<Integer>();
		ArrayList<Double> subAvgs = new ArrayList<Double>();
		for(int i = 0; i < scores.get(i).size(); i++) {
			int subSum = 0;
			for(int j = 0; j < scores.size(); j++) {
				subSum += scores.get(j).get(i);
			}
			subSums.add(subSum);
			subAvgs.add(Math.round((double)subSum / scores.size()*100)/100.0);
		}
//		System.out.println(subSums);
//		System.out.println(subAvgs);
		
		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			for(int j = 0; j < scores.get(i).size(); j++) {
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.print("\t" + sums.get(i));
			System.out.print("\t" + avgs.get(i));
			System.out.println("\t" + rank.get(i));
		}
		
		System.out.print("과목 합계");
		for(int i = 0; i < scores.get(i).size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		
		System.out.print("과목 평균");
		for(int i = 0; i < scores.get(i).size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////
//		Math.random();// 보안능력이 좋지 않음
//
//		String[] names = {"이정후", "은주영", "박다혜", "이다솜", "윤정영", 
//     			"이가은", "이상학", "신현국", "김은태", "황명성", 
//     			"이재원", "문승제", "권흥종", "이규범", "안은실", 
//     			"이희경", "오세영", "김민정", "최민정", "전윤미", 
//     			"김수원", "이소정", "임정은", "최지은", "최지연"};
//
//		ArrayList<Score> list = new ArrayList<Score>();
//		Random random = new Random();
//		random.nextInt(100); // 0부터 100까지
//		for (int i = 0; i < names.length; i++) {
//			list.add(new Score(
//					names[i]
//					, random.nextInt(101)
//					, random.nextInt(101)
//					, random.nextInt(101)
//					, random.nextInt(101)
//					, random.nextInt(101)
//					, random.nextInt(101)
//					, random.nextInt(101)));
//		}
//		
//		//1
//		for (Score score : list) { // -> 가져온 데이터(기준), 기준데이터를 구힉; 위한 반복문
//			int rank = 1;//처음은 1등으로 시젇
//			for (Score s : list) {//비교대상을 나타내는 반복문
//				if(score.getSum() < s.getSum()) {
//					rank++;
//				}
//			}
//			score.setRank(rank);	
//		}
//		//2
//		for(int i = 0; i < list.size(); i++) {
//			int rank = 1;
//			for(int j = 0; j < list.size(); j++) {
//				if(list.get(i).getSum() < list.get(j).getSum()) {
//					rank++;
//				}
//			}
//			list.get(i).setRank(rank);
//		}
//		
////		for(int i = 0; i < 25; i++) {
////			for(int j = 0; j < 25; j++) {
////				if(list.get(i).getSum() < list.get(j).getSum()) {
////					int rank = list.get(i).getRank() + 1;
////					list.get(i).setRank(rank);
////				}
////			}
////		}
////		
////		for (int i = 0; i < 24; i++) {
////			int min = i;
////			for (int j = i + 1; j < 25; j++) {
////				if (list.get(j).getRank() < list.get(min).getRank()) {
////					min = j;
////				}
////			}
////			list.set(min, list.set(i, list.get(min)));
////		}
//		
//		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
//		for (Score score1 : list) {
//			//향상된 for문: foreach문 jdk 1.5부터 사용가능
//			//장점: 전체 리스트를 순차적으로 인쇄하는건데 
//			// (class명 class별명) : (반복하고자 하는 배열데이터)
//			//Score score = list.get(0); 부터 순차적으로 나옴
//			System.out.println(score1);
//		}
//		
//		//과목합계
//		int[] sum = new int[7];	
//		for (Score score1 : list) {
//			sum[0] += score1.getKor();
//			sum[1] += score1.getEng();
//			sum[2] += score1.getMath();
//			sum[3] += score1.getSoc();
//			sum[4] += score1.getSci();
//			sum[5] += score1.getOracle();
//			sum[6] += score1.getJava();
//		}
//		System.out.printf("과목합계\t%,d\t%,d\t%,d\t%,d\t%,d\t%,d\t%,d\n", sum[0], sum[1], sum[2], sum[3], sum[4], sum[5], sum[6]);
//		
//		//과목평균
//		double[] avg = new double[7];
//			avg[0] = sum[0] / 25.0;
//			avg[1] = sum[1] / 25.0;
//			avg[2] = sum[2] / 25.0;
//			avg[3] = sum[3] / 25.0;
//			avg[4] = sum[4] / 25.0;
//			avg[5] = sum[5] / 25.0;
//			avg[6] = sum[6] / 25.0;
//		System.out.printf("과목평균\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f", avg[0], avg[1], avg[2], avg[3], avg[4], avg[5], avg[6]);
		
		
		
	}

}
