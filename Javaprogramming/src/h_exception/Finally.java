package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {

		/*
		 * finally
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 반드시 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수선언) {} catch(Exception e) {}
		 * - 사용 후 반환이 필요한 객체를 try의 ()안에서 생성하면 try를 블럭 종료시 자동으로 반환된다.
		 */
		
		FileInputStream fis = null; //파일 읽기 => 자바가 처리하는 것이 아닌 운영체제가 허락을 해주어야 파일을 읽거나 쓸 수 있다.
		
		
		try {
			fis = new FileInputStream("d:/file.txt"); //class에 대한 객체생성
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//남은 자원은 반환을 해주어야 한다 => 반드시 실행되어야 한다.
			//fis.close(); 줄을 가기 전에 예외가 발생하면 실행이 안되므로 finally를 사용한다
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//이 부분을 줄이기 위해 자동 자원 반환을 한다.		
			
			//자동 자원 반환(JDK 1.7)
			try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
				String str = "아무 내용이나 작성을 하면 됩니다...";
				
				byte[] bytes = str.getBytes();
				
				for(int i = 0; i < bytes.length; i++) {
					fos.write(bytes[i]);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}//close가 자동으로 호출
		}
		
		
		
		
	}

}
