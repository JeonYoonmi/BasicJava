package service;

import java.util.Map;

import dao.UserDao;
import util.ScanUtil;
import util.View;

public class UserService {

	//싱글톤 패턴
	//디자인 패턴 중 하나
	//디자인 패펀: 클래스를 만들다보니까 어떤 상황에 어떤 방식으로 만드는게 좋은지 정리해 놓은 것
	//싱글톤 패턴 : 객체생성을 막는 패턴
	//객체생성을 여러번 하지 않아도 되는 클래스인데 계속 만들면 메모리만 낭비되고 프로그램의 속도가 느려짐.
	//따라서 하나만 만들자.
	//생성자 앞에 private를 붙여서 생성자를 다른 클래스에서 못부르게 해서 객체생성을 하지 못하도록 한다.
	//객체생성할 때 부르는 것이 생성자.
	//이 클래스에서 객체를 직접 생성해서 전송해준다.
	public UserService() {
		
	}
	//객체를 보관해놓을 변수
	private static UserService instance;
	
	//객체를 빌려주는 메소드
	//다른 클래스에서 이 객체가 필요할 때에는 getInstance를 불러서 객체를 생성한다.
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	private static UserDao userDao = UserDao.getInstance();
	
	public static Map<String, Object> loginMember;
	
	public int join() {
		System.out.println("==========회원가입==========");
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		System.out.print("비밀번호>");
		String password = ScanUtil.nextLine();
		System.out.print("이름>");
		String memName = ScanUtil.nextLine();
		
		//아이디 중복 확인
		//비밀번호 확인
		//유효성 검사(정규표현식)
		
		int result = userDao.insertUser(memId, password, memName);
		
		if(0 < result) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
			
		return View.HOME;
		//다음 화면을 보여줄 때 메서드를 호출하는 것이 아니라 리턴을 해준다. 안그러면 원하는 화면으로 이동할 수 없음
	}

	public int login() {
		System.out.println("========== 로그인 ==========");
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		System.out.print("비밀번호>");
		String password = ScanUtil.nextLine();
		
		Map<String, Object> member = userDao.selectMember(memId, password);
		
		if(member == null) {
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else {
			System.out.println("로그인 성공");
			
			loginMember = member;
			return View.BOARD_LIST;
		}
		
		return View.LOGIN;
	}

	
	
	
}
