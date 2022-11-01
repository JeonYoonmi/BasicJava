package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {
	// 싱글톤 패턴
	public BoardDao() {

	}

	private static BoardDao instance;

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	
	public List<Map<String, Object>> selectBoardList(){
		String sql = "SELECT A.BOARD_NO"
				+ "			, A.TITLE"
				+ "			, A.CONTENT"
				+ "			, B.MEM_NAME"
				+ "			, TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
				+ "		FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOIN TB_JDBC_MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "		ORDER BY A.BOARD_NO DESC";
		return JDBCUtil.selectList(sql);
	}

	public Map<String, Object> read(int boardNo) {
		String sql = "SELECT A.BOARD_NO"
				+ "			, A.TITLE"
				+ "			, A.CONTENT"
				+ "			, B.MEM_NAME"
				+ "			, TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
				+ "		FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOIN TB_JDBC_MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "	   WHERE A.BOARD_NO = ?";
		
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		return JDBCUtil.selectOne(sql, param);
	}

	public int update(int boardNo, String title, String content) {
		String sql = "UPDATE TB_JDBC_BOARD"
				+ "		 SET TITLE = ?"
				+ "		   , CONTENT = ?"
				+ "	   WHERE BOARD_NO = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		return JDBCUtil.update(sql, param);
	}

	public int delete(int boardNo) {
		String sql = "DELETE FROM TB_JDBC_BOARD"
				+ "	   WHERE BOARD_NO = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		return JDBCUtil.update(sql, param);
	}

	public int insert(String title, String content, String memId) {
		String sql = "INSERT INTO TB_JDBC_BOARD"
				+ "	  VALUES ("
				+ "			(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				+ "			, ?, ?, ?, SYSDATE)";
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(memId);
		
		return JDBCUtil.update(sql, param);
	}

	public void insertCheck() {
		String sql = "SELECT MAX(BOARD_NO) AS BOARD_NO FROM TB_JDBC_BOARD";
		read((int)JDBCUtil.selectOne(sql).get("BOARD_NO"));
	}
	
	

	
	
	
}
