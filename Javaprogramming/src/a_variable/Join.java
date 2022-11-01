package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		// 다음과 같은 프로그램을 작성해주세요.
		/*
		 * =============화원가입================
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>99
		 * 키>185.5
		 * ==================================
		 * 회원가입 완료!!
		 * ==============내정보================
		 * 아이디: admin
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 나이: 99
		 * 키: 185.5
		 * ==================================
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=============회원가입===============");
		System.out.print("아이디>");
		String id = sc.nextLine();
		System.out.print("비밀번호(4자리숫자)>");
		String password = sc.nextLine();
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("나이>");
		String age = sc.nextLine();
		System.out.print("키>");
		Double height = Double.parseDouble(sc.nextLine());
		System.out.println("==================================");
		System.out.println("회원가입 완료!!");
		System.out.println("==============내정보================");
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + password);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("==================================");
		}

}
