package i_api;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식 => 회원가입할 때, 아이디와 패스워드 입력할 때, 특수문자 숫자 같은 조건을 검사할 떄 사용
		 * 
		 * ^(캐럿)	뒤 문자로 시작
		 * $		앞 문자로 종료
		 * .		임의의 문자(줄바꿈 제외)
		 * *		앞문자가 0개 이상
		 * +		앞문자가 1개 이상
		 * ?		앞문자가 없거나 1개
		 * []		문자의 집합이나 범위([a z]: a부터 z까지, [^a-z]: a부터 z가 아닌 것)
		 * {}		앞문자의 개수({2}: 2개, {2,4}: 2개이상 4개 이하)
		 * ()		그룹화(1개의 문자처럼 인식)
		 * |		OR 연산
		 * \s		공백, 탭, 줄바꿈
		 * \S		공백, 탭, 줄바꿈이 아닌 문자
		 * \w		알파벳이나 숫자
		 * \W		알파벳이나 숫자가 아닌 문자
		 * \d		숫자
		 * \D		숫자가 아닌 문자
		 * (?i)		뒷문자의 대소문자 구분 안함
		 * \		정규표현식에서 사용되는 특수문자 표현 => 특수문자 자체를 문자열에서 확인하고 싶을 때 사용
		 */
		
		//영문자 소문자가 3글자, 숫자 3개
		String str = "abc123"; 
//		String str1 = "abc1234"; 
//		String str2 = "abc123!"; 
		
		//정규표현식도 문자열로 만든다.
//		String regex = "[a-z]{3}\\d{1,3}"; //str: true //str2: false
		//[a - z]: 사이에 하나만 확인할 수 있다.
		//[a - z]{3}: 소문자가 정확히게 3개 올 수 있도록 만듬 
		//\d -> 컴파일 에러 : 자바는 \가 탈출문자인데 \d가 없는 내용이기 떄문에 \를 사용하고 싶으면 \하나를 더 붙여야 한다. =>[a - z]{3}\\d
		//\\d{1, 3}: 숫자는 1개 이상 3개 이하
		//코드를 작성하다가 띄어쓰기를 하는데 정규표현식 공백도 문자열에 일부로 인식하기 떄문에 공벡을 함부로 사용하면 안된다.
		
//		String regex = "[a-z0-9]+"; //str: true //str2: false
		//[a-z0-9] 사이의 문자가 1개 이상, 개수에 상관이 없음
		
		String regex = "\\w*"; //str: true => 표현이 가장 광범위함.
		
		//검사하는 코드 => Pattern를 사용
		//불린타입으로 알려줌
		boolean result = Pattern.matches(regex, str);
//		boolean result1 = Pattern.matches(regex, str1);
		System.out.println(result); 
//		System.out.println(result1); 
		
		//아이디, 전화번호, 이메일 주소의, 유효성을 검사하는 정규표현식을 만들어 주세요.
		//아이디: [a-z0-9_-]{5,20}
		//전화번호: ^0\\d{1,3}-\\d{3-,4}-\\d{4}
		//이메일주소: [a-z0-9]{5,20@[a-zA-z]+\\.(?i)(com\net\org([a-z]{2}\\.kr))$
		String id = "younmi"; 
		String phoneNum = "01012345678";
		String address = "d@naver.com";
		
		String regex_id = "\\w{5,20}";
		String regex_num = "\\d{11}";
		String regex_address = "\\W{3,6}\\s\\W{1,5}\\s\\W{1,5}\\d{0,3}";
		
		boolean result1 = Pattern.matches(regex_id, id);
		boolean result2 = Pattern.matches(regex_num, phoneNum);
		boolean result3 = Pattern.matches(regex_address, address);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
	}
	
}







