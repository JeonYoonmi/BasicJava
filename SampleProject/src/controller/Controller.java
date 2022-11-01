package controller;

import service.BoardService;
import service.UserService;
import util.ScanUtil;
import util.View;

public class Controller {

	public static void main(String[] args) {
		/*
		 * 발표순서 : 조 소개 > 주제소개 > 주제 선정 배경 > 메뉴 구조 > 시연 > 프로젝트 후기(각자 한마디씩)
		 * 발표인원 : 발표자 1명, ppt 및 시연 도우미 1명
		 * 발표 시간 : 15분
		 * 
		 * 웹개발 할 때 사용하는 방식으로 나눔 => 중복을 피할 수 있음.
		 * Controller : 화면 이동 
		 * Service : 화면 기능 
		 * Dao : 데이터베이스 조회
		 */
		
		new Controller().start();
	}

	private static UserService userService = UserService.getInstance();
	private static BoardService boardService = BoardService.getInstance();
	
	private void start() {
		int view = View.HOME;
		
		//프로그램에 존제하는 모든 화면이 있어야 한다
		//화면을 이동할 때 여기를 거치치 않으면 내가 원하지 않은 화면이 나올 수 있다.
		//메서드를 호출 하면사 화면을 이동.
		
		while(true) {
			switch(view) {
			case View.HOME: view = home(); break;
			case View.JOIN: view = userService.join(); break;
			case View.LOGIN: view = userService.login(); break;
			case View.BOARD_LIST: view = boardService.boardList(); break;
			case View.BOARD_READ : view = boardService.read(); break;
			case View.BOARD_INSERT : view = boardService.insert(); break;
			case View.BOARD_UPDATE : view = boardService.update(); break;
			case View.BOARD_DELET : view = boardService.delete(); break;
			}
		}
	}

	private int home() { //int값으로 리턴 => 그 다음 몇번 화면인지 리턴해주기 위함.
		System.out.println("1.로그인 2.회원가입 0.프로그램 종료>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1: return View.LOGIN;
		case 2: return View.JOIN;
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}
		return View.HOME;
	}

}
