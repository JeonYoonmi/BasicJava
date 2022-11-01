package study;

import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름>");
		String myName = s.nextLine();
		System.out.println("나이 입력>");
		int myAge = Integer.parseInt(s.nextLine());
		System.out.println("이름: " + myName + "/" + "나이: " + myAge);
		
		
	}

}
