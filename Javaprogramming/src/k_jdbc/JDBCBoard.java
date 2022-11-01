package k_jdbc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
		new JDBCBoard().start();
	}
	
	private void start() {
		while(true) {
			String sql = "SELECT A.BOARD_NO"
					+ "			, A.TITLE"
					+ "			, B.MEM_NAME"
					+ "			, TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE"
					+ "		FROM TB_JDBC_BOARD A"
					+ "		LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
					+ "		ORDER BY A.BOARD_NO DESC";
			List<Map<String, Object>> boardList = JDBCUtil.selectList(sql);
			
			System.out.println("==================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("----------------------------------");
			for(Map<String, Object> board : boardList) {
				System.out.print(board.get("BOARD_NO") + "\t");
				System.out.print(board.get("TITLE") + "\t");
				System.out.print(board.get("MEM_NAME") + "\t");
				System.out.print(board.get("REG_DATE") + "\n");
			}
			System.out.println("==================================");
			
			System.out.print("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				System.out.print("조회할 게시물 번호>");
				read(ScanUtil.nextInt());
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
		}
	}

	private void read(int boardNo) {
		String sql = "SELECT A.BOARD_NO"
				+ "		   , A.TITLE"
				+ "		   , A.CONTENT"
				+ "		   , B.MEM_NAME"
				+ "		   , TO_CHAR(A.REG_DATE, 'MM/DD') AS REG_DATE" //이런처리를 자바에서 하면 훨씬더 많은 작업이 필요하기때문에 최대한 처리해주고 부른다
				+ "		FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "	   WHERE A.BOARD_NO = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		Map<String, Object> board = JDBCUtil.selectOne(sql, param);
		System.out.println("======================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("작성자\t: " + board.get("MEM_NAME"));
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("======================================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			update(boardNo);
			break;
		case 2:
			delete(boardNo);
			break;
		case 0:
			
			break;
		}
	}

	private void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		
		String sql = "INSERT INTO TB_JDBC_BOARD"
				+ "	  VALUES ("
				+ "			(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				+ "			, ?, ?, ?, SYSDATE)";
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(memId);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글 등록이 완료되었습니다.");
			
			sql = "SELECT MAX(BOARD_NO) AS BOARD_NO FROM TB_JDBC_BOARD";
			read((int)JDBCUtil.selectOne(sql).get("BOARD_NO"));
		}else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
	}

	private void update(int boardNo) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		String sql = "UPDATE TB_JDBC_BOARD"
				+ "		 SET TITLE = ?"
				+ "		   , CONTENT = ?"
				+ "	   WHERE BOARD_NO = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글 수정이 완료되었습니다.");
		}else {
			System.out.println("게시글 수정에 실패하였습니다.");
		}
	}

	private void delete(int boardNo) {
		System.out.print("정말 삭제하시겠습니까?>");
		if(ScanUtil.nextLine().equals("Y")) {
			String sql = "DELETE FROM TB_JDBC_BOARD"
					+ "	   WHERE BOARD_NO = ?";
			List<Object> param = new ArrayList<Object>();
			param.add(boardNo);
			
			if(0 < JDBCUtil.update(sql, param)) {
				System.out.println("게시글이 삭제되었습니다.");
			}else {
				System.out.println("게시글 삭제에 실패하였습니다.");
			}
		}
	}

}












