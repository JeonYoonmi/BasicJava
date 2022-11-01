package f_game;

import e_oop.ScanUtil;

public class MyGame {
	
	Character c;
	Item[] items;
	
	{
		//객체생성을 하지 않고 사용하기 위해서 초가화 블럭을 이용해서 main 밖에서 초기화 해준다.
		//만약 main 안에서 하면 MyGame에 대한 객체를 생성헤서 어떤 변수(mg)에 저장을 해주고 mg.~~~를 사용해야함
		System.out.println("캐릭터의 이름을 입력해주세요>");
		String name = ScanUtil.nextLine();
		c = new Character(name);
		
		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);
	}

	public static void main(String[] args) { //static이 붙어있어서 객체생성을 하고 사용해야함
		 new MyGame().start();
		 
	}
	
	void start() { //static이 붙어있지 않아서 객체생성을 하지 않고 사용해도 됨.
		while(true) {
			System.out.println("1.내정보 2.사냥 0.종료");
			int input = ScanUtil.nextInt();
			
			switch(input) {
			case 1:
				c.showStatus();
				break;
			case 2: //여기서 직접 만들면 case문이 길어지기 때문에 메서드를 직접 만든다.
				hunt();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	
	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10, 1, 150, new Item[] {items[0], items[1]});
		System.out.println(m.name + "를 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle : while(true) {
			System.out.println("1.공격 2.도망>");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				c.attack(m);
				if(m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println("도망쳤습니다.");
				break battle;
			}
		}
	}
	

}
