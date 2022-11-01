package study;

public class Book {

	public static void main(String[] args) {
//		String strVar1 = "신민철";
//		String strVar2 = "신민철";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 문자열 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 문자열 다름");
//		}
//		
//		String strVar3 = new String("신민철");
//		String strVar4 = new String("신민철");
//		if(strVar3 == strVar4) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar3.equals(strVar4)) {
//			System.out.println("strVar1과 strVar2는 문자열 같음");
//		}else {
//			System.out.println("strVar1과 strVar2는 문자열 다름");
//		}
//		
//		
//		int[] scores = { 83, 90, 87 };
//
//		System.out.println("scores[0]: " + scores[0]);
//		System.out.println("scores[1]: " + scores[1]);
//		System.out.println("scores[2]: " + scores[2]);
//
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum);
//		double avg = (double) sum / 3;
//		System.out.println("평균: " + avg);
//		
//		
//		int sum1 = 0;
//		for (int i = 0; i < 3; i++) {
//			sum1 += scores[i];
//		}
//		System.out.println("총합: " + sum1);
//		
//		int sum2 = add(new int[] {83, 90, 87});
//		System.out.println("총합: " + sum2);
//		System.out.println();
//		}
//		
//		
//		public static int add(int[] scores) {
//			int sum = 0;
//			for(int i = 0; i<3; i++) {
//				sum += scores[i];
//				}
//		return sum;
		
		
//		int[] arr1 = new int[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr1[" + i + "]: " + arr1[i]);
//		}
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr[" + i + "]: " + arr1[i]);
//		}
//
//		double[] arr2 = new double[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr2[" + i + "]: " + arr2[i]);
//		}
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3;
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr2[" + i + "]: " + arr2[i]);
//		}
//		
//		String[] arr3 = new String[3];
//		for(int i = 0; i<3; i++) {
//			System.out.println("arr3[" + i + "]: " + arr3[i]);
//		}
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
//		for(int i = 0; i < 3; i++) {
//			System.out.println("arr3[" + i + "]: " + arr3[i]);
//		}
		
		
//		int[] scores = {83,90, 87};
//		
//		int sum = 0;
//		for(int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합: " + sum);
//		
//		double avg = (double)sum / scores.length;
//		System.out.println("평균: " + avg);
		
		
//		if(args.length != 2) {
//			System.out.println("값의 수가 부족합니다.");
//			System.exit(0);
//		}
//		
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println(num1 + "+" + num2 + "=" + result);
		
		
//		int[][] mathScores = new int[2][3];
//		for(int i = 0; i < mathScores.length; i++) {
//			for(int k = 0; k < mathScores[i].length; k++) {
//				System.out.println("mathScore[" + i + "][" + k + "]=" + mathScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		
//		for(int i = 0; i < englishScores.length; i++) {
//			for(int k = 0; k < englishScores.length; k++) {
//				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		int[][] javaScores = {{95, 80}, {92, 96, 80}};
//		for(int i = 0; i < javaScores.length; i++) {
//			for(int k = 0; k< javaScores[i].length; k++) {
//				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
//			}
//		}
		
		
//		String[] strArray = new String[3];
//		strArray[0] = "Java";
//		strArray[1] = "Java";
//		strArray[2] = new String("Java");
//		
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[0] == strArray[2]);
//		System.out.println(strArray[0].equals(strArray[2]));
		
		
//		int[] oldIntArray = {1, 2, 3};
//		
//		int[] newIntArray = new int[5];
//		
//		for(int i = 0; i < oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		
//		for(int i = 0; i < newIntArray.length; i++) {
//			System.out.print(newIntArray[i] + ",");
//		}
		
		
//		String[] oldStrArray = {"java", "array", "copy"};
//		String[] newStrArray = new String[5];
//		
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		
//		for(int i = 0; i< newStrArray.length; i++) {
//			System.out.print(newStrArray[i] + ",");
//		}
		
		
//		int[] scores = {95, 71, 84, 93, 87};
//		
//		int sum = 0;
//		for(int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("점수총합 = " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("점수평균 = " + avg);
		
		
		
		System.out.println("． 　 　 ∧ ∧\r\n" + 
				"　 　　(´･ω･ ∩　레벨 UP！\r\n" + 
				"　　　o.　　 ,ﾉ.\r\n" + 
				"　 　　Ｏ＿ .ﾉ\r\n" + 
				"　 　 　 　 (ノ\r\n" + 
				"　 　 　　i｜|\r\n" + 
				"　　　　 ━━\r\n" + 
				"");
		
		
		
		
		switch (input) {
		case 1:
			pp.useItems(pp);
			break;
		case 2:
			sp.useItems(sp);
			break;
		case 3:
			hp.useItems(hp);
			break;
		case 4:
			ep.useItems(ep);
			break;
		default:
			break;
		}
		
		
		
		
		
	}

}
