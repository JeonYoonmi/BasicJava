package d_array;
import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열 -> 대괄호의 수에 따라 차원이 정해짐(3차원 이상으로 사용하지는 않는다. 주로 2차원까지)
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 * **대괄호의 위치는 상관없음. 개수만 제대로
		 */
		
		//2차원
		int[][] array2;
		
		//3차원
		int [][][] array3;
		
		
		int [][] arr = new int[2][3]; //2칸짜리 배열 안에 각 칸마다 3칸짜리 배열이 생성된다.
		/*
		 * arr(변수) = 100번지(주소)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 */
		
		int arr2[][] = new int[][] {{1, 2, 3}, {4, 5, 6}}; //주로 사용하는 방법
		int[] arr3[] = {{1, 2, 3}, {4, 5,6}};
		
		int[][] arr4 = new int[3][]; //가변베열(변화가 가능하다.
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]);
		System.out.println(arr[0]); //배열의 주소가 출력된다.
		
//		arr[0] = 10; //값을 저장할 수 없다.
		arr[0] = new int[5];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		
		/*
		 * {
		 * {10, 20, 0, 0, 0},
		 * {100, 0, 0}
		 * }
		 */
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		int[] a = new int[3];
		a = new int[5];
		
		
		/*
		 * 단축키(ctrl + shift)
		 * sysout + ctrl + shift
		 * Scna + ctrl + shift
		 * 
		 * 라인 복사: ctrl + alt + 방향키
		 * 라인 이동: alt + 방향키
		 * 라인 삭제: ctrl + D
		 */
		
		int[][] scores = new int[3][4]; //int[학생수][과목수]
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//각 학생별 합계와 평균을 저장할 배열을 만들고, 합계와 평균을 저장해주세요
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j]; 
			}
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println(i + 1 + "번 째 학생 합계: " + sum[i] + " / " + "평균: " + avg[i]);
//			System.out.println("sum : " + sum[i] + " / avg : " + avg);
		}
		
		
		
		
		
		
		
	}

}
