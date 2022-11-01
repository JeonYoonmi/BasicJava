package f_game;

public class Character {
	
	String name;	//이름
	int maxHp;		//최대체력
	int maxMp;		//최대마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int level;		//레벨
	int exp;		//경험치
	Item[] items;	//보유아이템	//아이템 클래스가 만들어지지 않았을 때 ctrl+1을 누르면 클래스 만드는게 뜸
	
	//외부에서 결정되고 값을 받아야 하는 것을 파라미터로 설정(생성자)
	Character(String name){
		this.name = name;
		maxHp = 100;
		maxMp = 50;
		hp = maxHp;
		mp = maxMp;
		att = 20;
		def = 10;
		level = 1;
		exp = 0;
		items = new Item[10];
	}
	
	//캐릭터 정보
	void showStatus() {
		System.out.println("=====================================");
		System.out.println("-----------------상태-----------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100" + ")");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("----------------아이템----------------");
		for(int  i = 0; i < items.length; i++) {
			if(items[i] != null) {
				items[i].showItemInfo();
			}
		}
		System.out.println("=====================================");
	}
	
	//공격
	//공격할 대상은 여기서 결정할 수 없음 => 
	void attack(Monster m) {
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage <= m.hp ? damage : m.hp;
		System.out.println(name + "가 공격으로" + m.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 현재 체력: " + m.hp + "/" + m.maxHp);
	}
	
	//경험치 얻기
	//경험치는 몬스터에 따라 다르기 떼문에 몬스터에게 정보를 받아야 함 => 파라메터
	void getExp(int exp) {
		System.out.println(exp + "의 경험치를 휙득하였습니다.");
		this.exp += exp;
		while(100<= this.exp) {
			levelUp();
			this.exp -= 100;
		}
	}
	
	//레벨업
	void levelUp() {
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def +=2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("레벨업!!");
	}
	
	//아이템 얻기
	//몬스터에 따라 떨어뜨리는 아이템이 다름
	void getItem(Item item) {
		System.out.println(item.name + "을 휙득하였습니다.");
		for(int i = 0 ; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
	
	
	
	
	
	
	
	
	
	
	

}
