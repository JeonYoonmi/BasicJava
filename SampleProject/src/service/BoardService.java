package service;

import java.util.List;
import java.util.Map;

import dao.BoardDao;
import util.ScanUtil;
import util.View;

public class BoardService {

	// 싱글톤 패턴
	public BoardService() {

	}

	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}

	int boardNo;
	
	private static BoardDao boardDao = BoardDao.getInstance();
	
	// 게시판 목록
	public int boardList() {
		List<Map<String,Object>> boardList = boardDao.selectBoardList();
		
		System.out.println("===================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("===================================");
		for (Map<String, Object> board : boardList) {
			System.out.print(board.get("BOARD_NO") + "\t");
			System.out.print(board.get("TITLE") + "\t");
			System.out.print(board.get("MEM_NAME") + "\t");
			System.out.print(board.get("REG_DATE") + "\n");
		}
		System.out.println("===================================");
		
		System.out.println("1.조회 2.등록 0.로그아웃");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			return View.BOARD_READ;
		case 2:
			return View.BOARD_INSERT;
		case 0:
			UserService.loginMember = null;
			return View.HOME;
		}
		return View.BOARD_LIST;
	}
	
	//게시물 화면
	public int read() {
		//쿼리작성은 Dao에서 한다.
		//화면을 이동하기 위해서는 return을 한다.
		System.out.print("조회할 게시물 번호>");
		this.boardNo = ScanUtil.nextInt();
		Map<String, Object> read = boardDao.read(this.boardNo);
		System.out.println("======================================");
		System.out.println("번호\t: " + read.get("BOARD_NO"));
		System.out.println("작성자\t: " + read.get("MEM_NAME"));
		System.out.println("작성일\t: " + read.get("REG_DATE"));
		System.out.println("제목\t: " + read.get("TITLE"));
		System.out.println("내용\t: " + read.get("CONTENT"));
		System.out.println("======================================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			if(UserService.loginMember.get("MEM_NAME").equals(read.get("MEM_NAME"))) {
				return View.BOARD_UPDATE;
			}else{
				System.out.println("수정할 권한이 없습니다.");
			};
			break;
		case 2:
			if(UserService.loginMember.get("MEM_NAME").equals(read.get("MEM_NAME"))) {
				return View.BOARD_DELET;
			}else{
				System.out.println("수정할 권한이 없습니다.");
			};
			break;
		case 0:
			return View.BOARD_LIST;
		}
		return View.BOARD_LIST;
	}

	public int insert() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		
		int insert = boardDao.insert(title, content, memId);
		
		if(0 < insert) {
			System.out.println("게시글 등록이 완료되었습니다.");
			boardDao.insertCheck();
		}else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
		
		return View.BOARD_LIST;
	}

	public int update() {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		int read = boardDao.update(this.boardNo, title, content);
		if(0 < read) {
			System.out.println("게시글 수정이 완료되었습니다.");
		}else {
			System.out.println("게시글 수정에 실패하였습니다.");
		}
		
		return View.BOARD_LIST;
	}

	public int delete() {
		System.out.print("정말 삭제하시겠습니까?>");
		if(ScanUtil.nextLine().equals("Y")) {
			int delete = boardDao.delete(this.boardNo);
			if(0 < delete) {
				System.out.println("게시글이 삭제되었습니다.");
			}else {
				System.out.println("게시글 삭제에 실패하였습니다.");
			}
		}
		
		return View.BOARD_LIST;
	}
	

}
