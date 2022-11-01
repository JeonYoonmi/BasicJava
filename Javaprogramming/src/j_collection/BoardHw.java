package j_collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;
import k_jdbc.JDBCUtil;

public class BoardHw {
	int boardNo = 1;
	
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		new BoardHw().start();

	}
	
	private void start() {
		while(true) {
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------");
			String sql = "select * from TV_JDBC_BOARD";
			List<Map<String, Object>> list = JDBCUtil.selectList(sql);
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).get("BOARD_NO") + "\t");
				System.out.print(list.get(i).get("TITLE") + "\t");
				System.out.print(list.get(i).get("MEM_ID") + "\t");
				System.out.print(list.get(i).get("REG_DATE") + "\n");
			}
			System.out.println("=================================");
			
			System.out.print("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				System.out.print("조회할 게시글 번호>");
				int boardNo = ScanUtil.nextInt();
//				read(list, boardNo);
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

	private void insert() {
		
		String sql = "insert into tv_jdbc_board values(?, ?, ?, ?, sysdate)";
		
		List<Object> param = new ArrayList<Object>();
		param.add(1);
		
		param = new ArrayList<Object>();
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		param.add(ScanUtil.nextLine());
		
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		param.add(ScanUtil.nextLine());
		
		System.out.print("작성자>");
		String memName = ScanUtil.nextLine();
		param.add(memName);
		
		
		int result = JDBCUtil.update(sql, param);
		
		
//		this.boardNo++;
	}

//	private void read(List<Map<String, Object>> list, int boardNo) {
//		Map<String, Object> board = null;
//
//		for (Map<String, Object> _board : list) {
//			if ((int) _board.get("BOARD_NO") == boardNo) {
//				board = _board;
//			}
//		}
//		System.out.println("=================================");
//		System.out.println("번호\t: " + list.get(boardNo).get("BOARD_NO"));
//		System.out.println("작성자\t: " + list.get(boardNo).get("MEM_ID"));
//		System.out.println("작성일\t: " + list.get(boardNo).get("REG_DATE"));
//		System.out.println("제목\t: " + list.get(boardNo).get("TITLE"));
//		System.out.println("내용\t: " + list.get(boardNo).get("CONTENT"));
//		System.out.println("=================================");
//		
//		System.out.print("1.수정  2.삭제  0.목록>");
//		int input = ScanUtil.nextInt();
//		switch (input) {
//		case 1:
////			udpate(list, boardNo);
//			break;
//		case 2:
////			delete(board);
//			break;
//		case 0:
//			
//			break;
//		}
//	}

//	private void udpate(List<Map<String, Object>> list, int boardNo) {
//		String sql = "select * from cart where board_no = ?";
//		
//		List<Object> param = new ArrayList<Object>();
//		System.out.println(boardNo);
//		param.add(boardNo);
//		
//		List<Map<String,Object>> list2 = JDBCUtil.selectList(sql, param);
//		
//		System.out.println(list2);
//		
//		sql = "insert into cart(TITLE, CONTENT) values(?, ?)";
//		param = new ArrayList<Object>();
//		System.out.print("제목>");
//		String title = ScanUtil.nextLine();
//		param.add(title);
//		
//		System.out.print("내용>");
//		String content = ScanUtil.nextLine();
//		param.add(content);
//		
//		int result = JDBCUtil.update(sql, param);
//		System.out.println(result);
//		
//	}

	
}
