package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent {

	public static void main(String[] args) {
		//제비뽑기 프로그램
		//25명의 학생을 입력받은 숫자만큼 뽑아야 한다.(중복되지 않아야 한다.)
		Scanner sc = new Scanner(System.in);
		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };

		System.out.println("몇명을 뽑으시겠습니까? >>");
		int count = sc.nextInt();
		
		String[] pick = new String[count];
		int pickCount = 0;
		do {
			int random = (int)(Math.random() * students.length);
			
			boolean flag = true;
			for(int i=0; i<pick.length; i++) {
				if(students[random].equals(pick[i])) { //pick[]처음에는 {null, null, ---}
					flag = false;
				}
			}
			
			if(flag) {
				pick[pickCount++] = students[random];
			}
		}while(pickCount < count);
		System.out.println(Arrays.toString(pick));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
//				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };	
//		
//		System.out.println("제비뽑기 프로그램");
//		System.out.print("몇명을 뽑으시겠습니까?>");
//		
//		int input = s.nextInt();
//		
//		while(input > 25 || input == 0){
//			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
//			System.out.print("몇명을 뽑으시겠습니까?>");
//			input = s.nextInt();
//		}
//		
//		String[] num = new String[input];
//		int[] j = new int[input];
//		
//			for (int i = 0; i < input; i++) {
//				do {
//						j[i] = (int) (Math.random() * 25);
//					}while(students[j[i]] == null);
//				num[i] = students[j[i]];
//				students[j[i]] = null;
//			}
//		System.out.println("뽑힌사람은 " + Arrays.toString(num));
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
//				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };
//
//		System.out.println("제비뽑기 프로그램");
//		System.out.print("몇명을 뽑으시겠습니까?>");
//		
//		int input = Integer.parseInt(s.nextLine());
//		
//		while(input > 25 || input == 0){
//			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
//			System.out.print("몇명을 뽑으시겠습니까?>");
//			input = s.nextInt();
//		}
//		
//		int[] shuffle = new int[25];
//		for(int i = 0; i < shuffle. length * 100; i++) {
//			int random = (int)(Math.random() * shuffle.length);
//			int temp = shuffle[0];
//			shuffle[0] = shuffle[random];
//			shuffle[random] = temp;
//		}
//		
//		for(int b = 0; b < input; b++) {
//			System.out.println("student[shuffle[b]]");
//		}
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
//				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };
//
//		System.out.println("제비뽑기 프로그램");
//		System.out.print("몇명을 뽑으시겠습니까?>");
//		
//		int input = Integer.parseInt(s.nextLine());
//		
//		while(input > 25 || input == 0){
//			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
//			System.out.print("몇명을 뽑으시겠습니까?>");
//			input = s.nextInt();
//		}
//		
//		String[] stu2 = new String [input];
//		
//		for(int i=0; i<input; i++) {
//			int ran[i] = (int)(Math.random()*students.length);
//			for(int j=0; j<i;j++) {
//				if(ran[i] == ran[j]) {
//					i--;
//				}
//			}
//			stu2[i] = students[ran[i]];
//		}
//		System.out.println("뽑힌사람은: " + Arrays.toString(stu2));
		
		
		
		
		          
//		Scanner s = new Scanner(System.in);
//		String[] students = { "이정후", "은주영", "박다혜", "이다솜", "윤정영", "이가은", "이상학", "신현국", "김은태", "황명성", "이재원", "문승제", "권홍종",
//				"이규범", "안은실", "이희경", "오세영", "김민정", "최민정", "전윤미", "김수원", "이소정", "임정은", "최지은", "최지연" };
//
//		System.out.print("몇명을 뽑으시겠습니까?>");
//		int input = s.nextInt();
//		
//		String[] students_copy = students;
//		int tg = 0;
//		
//		for(int i=0; i<input; i++) {
//			tg = (int)(Math.random()*(students_copy.length));
//			System.out.println(i==0 ? students_copy[tg] : ", " + students_copy[tg]);
//			
//			String[] tmp_arr = new String[students_copy.length -1];
//			
//			for(int j=0; j<students_copy.length -1; j++) {
//				if(tg <= j) tmp_arr[j] = students_copy[j+1];
//				else tmp_arr[j] = students_copy[j];
//			}
//			students_copy = tmp_arr;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int input = s.nextInt();
//		String[] num = new String[input];
//		int[] b = new int[input];
//		int j = 0;
//		int i = 0;
//
//		for (i = 0; i < input; i++) {
//			while(true) {
//				for(j=0;j<i;j++) {
//				b[j] = (int) (Math.random() * 25);
//				b[j+1] = (int) (Math.random() * 25);
//				do{
//					for(int k = 0; k < j; k++) {
//						if(b[0] != b[k]) {
//							break;
//						}
//					}
//				}
//				num[i] = students[b[j]];
//			}
//			
//		}
//		System.out.println("뽑힌사람은 " + Arrays.toString(num));
		
		
//		int input = s.nextInt();
//		int[] num = new int[input];
//		String[] b = new String[input];
//		int j = 0;
//		int i = 0;
//
//		for (; i < input; i++) {
//			num[i] = (int) (Math.random() * 25);
//			for(;j<i;j++) {
//				
//				if(num[i] == num[j]) {
//					i--;
//				}
//				b[i] = students[num[j]];
//			}
//		}
		
//		System.out.println("뽑힌사람은 " + Arrays.toString(num));

		
		
		
		/*
		 * 중복인 경우를 없애야 함
		 * random 숫자를 n개를 뽑았을 때 중복이 없어야 한다.
		 */
//		num[i] = students[random];
		
//		if (num.equals(num)) {
//			num[i] = students[random];
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

