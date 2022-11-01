package k_jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc16";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from empty_dept";

			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();

			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.println(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
			
			sql = "insert into empty_dept values(50, 'num', 'Korea')";

			ps = con.prepareStatement(sql);

			int result = ps.executeUpdate();
			System.out.println(result);
			
			sql = "delete from empty_dept where dname = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "num");

			int result1 = ps.executeUpdate();
			System.out.println(result1);
			
			sql = "update empty_dept set dname = ? where dname = 'num'";
			ps = con.prepareStatement(sql);
			ps.setString(1, "price");
			
			int result2 = ps.executeUpdate();
			System.out.println(result2);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}

	}

}
