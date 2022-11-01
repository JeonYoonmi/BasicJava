package j_collection;

import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {

	private ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String,Object>>();
	private SimpleDateFormat format = new SimpleDateFormat("MM-dd");
	
	public static void main(String[] args) {
		//원하는 클래스를 선택후 F2를 누르면 클래스 이름 변경가능
		/*
		 * 목록(제목만 나옴)	>	조회(내용까지 나옴)	>	수정(목록에 변경이 생김)
		 * 									>	삭제
		 * 				>	등록 
		 * 
		 * ------------------------------------
		 * 번호		제목		작성자		작성일
		 * 4		안녕		홍길동		04/06
		 * 3		안녕		홍길동		04/06
		 * 2		안녕		홍길동		04/06
		 * 1		안녕		홍길동		04/06
		 * ------------------------------------
		 * 1.조회		2.등록	3.종료>
		 */
		new Board().start();
	}

//	private void start() {
//		int count = 0;
//		
//		ArrayList<HashMap<String, Object>> board = new ArrayList<HashMap<String, Object>>();
//		HashMap<String, Object> row = new HashMap<String, Object>();
//		
//		b: while(true) {
//			System.out.println("======================================================");
//			System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
//			System.out.println("------------------------------------------------------");
//			for(int i = board.size() - 1 ; i >= 0; i--) {
//				row = board.get(i);
//				System.out.println(i+1 + "\t\t" + row.get("제목")+ "\t\t" + row.get("작성자")+ "\t\t" + row.get("작성일"));
//			}
//			System.out.println("======================================================");
//			
//			System.out.print("1.조회\t\t2.등록\t\t0.종료>");
//			int input = ScanUtil.nextInt();
//			System.out.println("======================================================");
//			
//			switch(input) {
//			case 1:
//				System.out.print("1.수정\t\t2.삭제\t\t0.목록>");
//				input = ScanUtil.nextInt();
//				System.out.println("======================================================");
//				switch(input) {
//				case 1:
//					System.out.println("게시글 번호>");
//					int num = ScanUtil.nextInt();
//					row = board.get(num -1);
//					
//					row.remove("제목");
//					System.out.print("제목 : ");
//					String title = ScanUtil.nextLine();
//					row.put("제목", title);
//					
//					row.remove("내용");
//					System.out.print("내용 : ");
//					String main = ScanUtil.nextLine();
//					row.put("내용", main);
//					break;
//					
//				case 2:
//					System.out.println("게시글 번호>");
//					num = ScanUtil.nextInt();
//					row = board.get(num -1);
//					board.remove(num-1);
//					break;
//					
//				case 0:
//					break;
//				}
//				
//				break;
//			case 2:
//				row = new HashMap<String, Object>();
//				
//				System.out.print("제목 : ");
//				String title = ScanUtil.nextLine();
//				row.put("제목", title);
//				
//				System.out.print("작성자 : ");
//				String name = ScanUtil.nextLine();
//				row.put("작성자", name);
//				
//				System.out.print("내용 : ");
//				String main = ScanUtil.nextLine();
//				row.put("내용", main);
//				
//				Date today = new Date();
//				SimpleDateFormat date = new SimpleDateFormat("MM/dd");
//				row.put("작성일", date.format(today));
//
//				board.add(row);
//
//				break;
//
//			case 0:
//				System.out.println("종료되었습니다.");
//				break b;
//			}
//		}
	
	private void start() {
		while(true) {
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------");
			for(int i = boardTable.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardTable.get(i);
				System.out.print(board.get("BOARD_NO") + "\t");
				System.out.print(board.get("TITLE") + "\t");
				System.out.print(board.get("MEM_NAME") + "\t");
				System.out.print(format.format(board.get("REG_DATE")) + "\n");
			}
			System.out.println("=================================");
			
			System.out.print("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				System.out.print("조회할 게시글 번호>");
				int boardNo = ScanUtil.nextInt();
				read(boardNo);
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
		HashMap<String, Object> board = null;
		
		for(HashMap<String, Object> _board : boardTable) {
			if((int)_board.get("BOARD_NO") == boardNo) {
				board = _board;
			}
		}
		
		System.out.println("=================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("작성자\t: " + board.get("MEM_NAME"));
		System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("=================================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			udpate(board);
			break;
		case 2:
			delete(board);
			break;
		case 0:
			
			break;
		}
	}

	private void udpate(HashMap<String, Object> board) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("TITLE", title);
		board.put("CONTENT", content);
		
		System.out.println("수정되었습니다.");
	}

	private void delete(HashMap<String, Object> board) {
		for(int i = 0; i < boardTable.size(); i++) {
			if(boardTable.get(i).get("BOARD_NO") == board.get("BOARD_NO")) {
				System.out.print("정말 삭제하시겠습니까?");
				if(ScanUtil.nextLine().equals("Y")) {
					boardTable.remove(i);
					System.out.println("삭제되었습니다.");
				}
				break;
			}
		}
	}

	private void insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>");
		String memName = ScanUtil.nextLine();
		
		int maxBoardNo = 0;
		for(HashMap<String, Object> board : boardTable) {
			int boardNo = (int)board.get("BOARD_NO");
			if(maxBoardNo < boardNo) {
				maxBoardNo = boardNo;
			}
		}
		
		int boardNo = maxBoardNo + 1;
		
		HashMap<String, Object> board = new HashMap<String, Object>();
		board.put("BOARD_NO", boardNo);
		board.put("TITLE", title);
		board.put("CONTENT", content);
		board.put("MEM_NAME", memName);
		board.put("REG_DATE", new Date());
		
		boardTable.add(board);
		System.out.println("등록되었습니다.");
		
		read(boardNo);
	}
}
