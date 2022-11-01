package e_oop.restaurant;

import java.util.Arrays;

public class Alba {
	
	//메서드: 알바가 할 일(보스가 알바에게 시킨 일)
	//파라미터: 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입: 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
	
	//주문받기
	//주문받기 위해 필요한 것? 없음
	//주문받은 후 보스에게 줄 것? 주문서
	String[] order() {
		System.out.println("주문하시겠습니까?");
		return new String[] {"자장면", "탕수육"};
	}
	
	//서빙
	//서빙하기 위해 필요한 것? 음식
	//서빙 후 보스에게 줄 것? 없음
	void serving(String[] food) {
		System.out.println(Arrays.toString(food) + "나왔습니다. 맛있게드세요.");
	}
	
	//계산
	//계산하기 위해 필요한 것? 계산서
	//계산 후 보스에게 줄 것? 없음
	void pay(String[] order) {
		System.out.println("2만원입니다. 안녕히가세요.");
	}
	
}
