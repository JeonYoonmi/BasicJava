package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성(DB 연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4.ResultSet에서 결과 추출(select인 경우) --insert, delete, update의 경우 이 과정 생략
		 * 5. ResultSet, Statement, Connection 닫기
		 */

		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc16";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			//driver : 서로 다른 프로그램을 연결해야하는데 그 역할을 하는 것, 그냥은 연결이 안된다.
			//DriverManager : driver를 관리해주는 클래스, 데이터베이스의 종류가 많기 때문에 이렇게 관리
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery(); //조회결과
			
			//insert, update, delete
//			int result =ps.executeUpdate(); //영향받은 행의 수
			
			while(rs.next()) { //next: 다음행의 여부(있으면 true, 없으면 false)를 알려주고 있으면 거기에서 데이터를 가지고 올 수 있게 해줌
				//getString의 파라미터 2가지
				String memId = rs.getString(1); //컬럼의 인덱스를 지정
				String memPass = rs.getString("MEM_PASS"); //컬럼명 지정
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null)try { rs.close(); }catch(Exception e){ }
			if(ps != null)try { ps.close(); }catch(Exception e){ }
			if(con != null)try { con.close(); }catch(Exception e){ }
			
		}
		
		
	}

}












