package k_jdbc;

public class JDBCBoardPractice {

	public static void main(String[] args) {
		new JDBCBoardPractice().start();
	}

	private void start() {
		String sql = "SELECT A.BOARD_NO"
				+ "			, A.TITLE"
				+ "			, B.MEM_NAME"
				+ "			, A.TO_CHAR(REG_DATE, 'MM/DD')"
				+ "	  FROM TB_JDBC_BOARD A"
				+ "							LEFT OUTER JOIN MEMBER B"
				+ "";
	}

}
