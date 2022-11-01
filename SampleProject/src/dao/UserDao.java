package dao;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import util.JDBCUtil;

public class UserDao {

	// 싱글톤 패턴
	public UserDao() {

	}

	private static UserDao instance;

	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();
		}
		return instance;
	}

	public int insertUser(String memId, String password, String memName) {
		String sql = "INSERT INTO TB_JDBC_MEMBER" + " VALUES (?, ?, ?)";
		List<Object> param = new ArrayList<Object>();
		param.add(memId);
		param.add(password);
		param.add(memName);

		return JDBCUtil.update(sql, param);
	}

	public Map<String, Object> selectMember(String memId, String password) {
		String sql = "SELECT MEM_ID, PASSWORD, MEM_NAME" 
				+ "		FROM TB_JDBC_MEMBER" 
				+ "		WHERE MEM_ID = ?"
				+ "		AND PASSWORD = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(memId);
		param.add(password);

		return JDBCUtil.selectOne(sql, param);
	}
	
	

}
