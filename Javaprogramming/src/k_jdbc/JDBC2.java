package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		//데이터베이스 접속 정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "pc16";
				String password = "java";
				
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				try {
					con = DriverManager.getConnection(url, user, password);

					//쿼리 쓸 때 띄어쓰기 주의
					String sql = "select *"
							+ " from cart"
							+ " where cart_member =?" //값을 써도 되고 ?로도 가능한데 ?로 할 경우 원하는 값을 유동적으로 세팅할 수 있다.
							+ " and cart_qty > ?"; //값만 대신할 수 있고 컬럼명이나 테이블 명을 대신할 수 없다.
					
					ps = con.prepareStatement(sql);
					//물음표에 넣을 값 설정
					//(인덱스번호, 넣을 값)
					ps.setString(1, "a001");
					ps.setInt(2, 5);
					
					rs = ps.executeQuery();
					ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
					
					int columnCount = metaData.getColumnCount();
					
					while(rs.next()) {
						for(int i = 1; i <= columnCount; i++) {
							System.out.print(rs.getObject(i) + "\t"); //컬럼마다 어떤 타입인지 모르기 때문에 getObject를 사용한디
						}
						System.out.println();
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