package f_game.assignment_final;

import f_game.assignment_final.ScanUtil;

public class Character {

	String name;
	String gender;
	
	String name1;
	String CharacterInfo;
	int hp;	
	int att;		
	int def;
	int level;
	int exp;
	int maxHp;	
	String skill;
	String type;
	
	PoketBall P;
	GreatBall G;
	UltraBall U;
	Potion pp;
	SuperPotion sp;
	HyperPotion h;
	ExpPotion xp;
	
	PC pc;
	String[] rtn;
	Poketmon poketmon;
	
	{
	P = new PoketBall();
	G = new GreatBall();
	U = new UltraBall();
	pp = new Potion();
	sp = new SuperPotion();
	h = new HyperPotion();
	xp = new ExpPotion();
	pc = new PC();
	}
	
	Character(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	Character(String name, String CharacterInfo, int hp, int att, int def, int level, int exp, String skill, String type){
		this.name1 = name;
		this.CharacterInfo = CharacterInfo;
		this.maxHp = hp;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.level = level;
		this.exp = exp;
		this.skill = skill;
		this.type = type;
	}
	
	public Character() {
	}
	
	void showPoketmonStatus() {
		System.out.println("=========================================================");
		System.out.println("-------------------------포켓몬 정보------------------------");
		System.out.println("=========================================================");
		String info = "이름: " + this.name1 + "\n";
		System.out.println(this.name1);
		info += "설명: " + this.CharacterInfo + "\n"; 
		info += "속성: " + this.type + "\n";
		if (0 < this.hp)
			info += "체력: " + this.hp + "\n";
		if (0 < this.def)
			info += "방어력: " + this.def + "\n";
		if (0 < this.level)
			info += "레벨: " + this.level + "\n";
		if (0 <= this.exp)
			info += "경험치: " + "(" + this.exp + "/100" + ")" + "\n";
			info += "스킬 이름: " + this.skill + "\n";
		if (0 < this.att)
			info += "스킬 공격력: " + this.att;

		System.out.println(info);
		System.out.println("=========================================================");
		System.out.println();
	}

	void showcharacterStatus() {
		System.out.println("=========================================================");
		System.out.println("--------------------------내 정보--------------------------");
		System.out.println("=========================================================");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("=========================================================");
		System.out.println();
	}
	
	void useItems(Item item, int input) {
		if (item.hpheal > 0)
			getHp(item.hpheal, input);
		if (item.expadd > 0)
		getExp(item.expadd, input);

	}

	void showItemStatus() {
		System.out.println("=========================================================");
		System.out.println("--------------------------아이템--------------------------");
		System.out.println("=========================================================");
		P.showItemInfo(P);
		G.showItemInfo(G);
		U.showItemInfo(U);
		pp.showItemInfo(pp);
		sp.showItemInfo(sp);
		h.showItemInfo(h);
		xp.showItemInfo(xp);
		System.out.println("=========================================================");
	}
	
	void attack(Poketmon m) {
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage <= m.hp ? damage : m.hp;
		System.out.print("　   ∧＿∧ \n"
					   + "       (　･ω･)＝つ≡つ \n"
					   + "       (っ　≡つ＝つ \n"
					   + "./　 ) \n"
					   + "(/￣∪    \n ");
		System.out.println(name1 + "(이)가 " + skill + "으로 " + m.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 현재 체력: " + m.hp + "/" + m.maxHp);
	}
	
	
	void getExp(int exp, int i) {
		System.out.println("경험치를 휙득하였습니다. +" + exp * i);
		this.exp += exp * i;
		if(100 <= this.exp) {
			levelUp(this.exp / 100);
			this.exp %= 100;
		}
	}
	
	void getHp(int hp, int i) {
		System.out.println("체력이 회복되었습니다. +" + hp * i);
		this.hp += hp * i;
		if(this.maxHp <= hp) {
			this.hp = this.maxHp;
		}
	}
	
	void levelUp(int i) {
		this.level += 1 * i;
		this.maxHp += 5 * i;
		this.att += 5 * i;
		this.def += 5 * i;
		this.hp = this.maxHp;
		System.out.println("． 　 　 ∧ ∧\r\n" + 
				"　 　　(´･ω･ ∩　레벨 UP！\r\n" + 
				"　　　o.　　 ,ﾉ.\r\n" + 
				"　 　　Ｏ＿ .ﾉ\r\n" + 
				"　 　 　 　 (ノ\r\n" + 
				"　 　 　　i｜|\r\n" + 
				"　　　　 ━━\r\n" + 
				"");
	}
	
	void ThrowBall(Poketmon m) {
		System.out.println("어떤공을 던지시겠습니까?");
		System.out.println("1.몬스터볼\t\t2.슈퍼볼\t\t3.하이퍼볼\t\t4.가방나가기");
		int input = ScanUtil.nextInt();
		int ran = (int)(Math.random() * 10);
		switch(input) {
		case 1:
			System.out.println("공을 던졌습니다.");
			System.out.println("   ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n" + 
					"(·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n" + 
					"(つ　 <  \r\n" + 
					"｜　 _つ                                         \r\n" + 
					"`し´");
			int[] b1 = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0};
			int result1 = b1[ran];
			stop();
			if(result1 == 0) {				
				System.out.println(m.name + "(을)를 놓쳤습니다.\n" + m.name + "가 도망갔습니다.");
			}else {
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}
			break;
		case 2:
			System.out.println("공을 던졌습니다.");
			System.out.println("   ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n" + 
					"(·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n" + 
					"(つ　 <  \r\n" + 
					"｜　 _つ                                         \r\n" + 
					"`し´");
			int[] b2 = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0};
			int result2 = b2[ran];
			stop();
			if(result2 == 0) {				
				System.out.println(m.name + "(을)를 놓쳤습니다.\n" + m.name + "가 도망갔습니다.");
			}else {
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}
				
			break;
		case 3:
			System.out.println("공을 던졌습니다.");
			System.out.println("   ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n" + 
					"(·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n" + 
					"(つ　 <  \r\n" + 
					"｜　 _つ                                         \r\n" + 
					"`し´");
			int[] b3 = {0, 1, 1, 1, 1, 1, 0, 1, 1, 0};
			int result3 = b3[ran];
			stop();
			if(result3 == 0) {				
				System.out.println(m.name + "(을)를 놓쳤습니다.\n" + m.name + "가 도망갔습니다.");
			}else if(result3 ==1){
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}
			break;
		default:
			break;
		}
	}

	private void stop() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
