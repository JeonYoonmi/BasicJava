package f_game.assignment;

import e_oop.ScanUtil;

public class Character {

	String name;
	String gender;
	String CharacterInfo;
	int hp;	
	int att;		
	int def;
	int level;
	int exp;
	int maxHp;	
	String skill;
	String type;
	
	Item items1; //몬스터볼
	Item items2; //상처약
	Item[] item1; //몬스터볼
	Item[] item2; //상처약
	
	Poketmon poketmon;
	Item items;
	
	int probability;
	int hpheal;
	int expadd;
	
	PoketBall P;
	GreatBall G;
	UltraBall U;
	Potion pp;
	SuperPotion sp;
	HyperPotion h;
	ExpPotion xp;
	
	PC pc;
	String[] rtn;
	
	{
	poketmon = new Poketmon(name, CharacterInfo, hp, att, def, level, exp, skill, type);
	items1 = new Item(name, probability);
	items2 = new Item(name, hpheal, expadd);
	P = new PoketBall();
	G = new GreatBall();
	U = new UltraBall();
	pp = new Potion();
	sp = new SuperPotion();
	h = new HyperPotion();
	xp = new ExpPotion();
	pc = new PC();
	rtn = new String[pc.j];
	}
	
	Character(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	void showStatus() {
		System.out.println("===========================================");
		System.out.println("--------------------상태--------------------");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);

		System.out.println("----------------스타팅 포켓몬 정보----------------");
			if (poketmon != null) {
				poketmon.showPoketmonInfo();
			}
		
		System.out.println("--------------------아이템--------------------");			
				P.showItemInfo(P);
				G.showItemInfo(G);
				U.showItemInfo(U);
				pp.showItemInfo(pp);
				sp.showItemInfo(sp);
				h.showItemInfo(h);
				xp.showItemInfo(xp);
		
		System.out.println("============================================");
	}
	
	void getPoketmon(Poketmon poketmons) {
		System.out.println(poketmons.name + "를 선택하셨습니다.");
			if(poketmon != null) {
				poketmon = poketmons;
				
			}
		
	}
	
	void attack(Poketmon m) {
		int damage = poketmon.att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage <= m.hp ? damage : m.hp;
		System.out.print("　   ∧＿∧ \n"
					   + "       (　･ω･)＝つ≡つ \n"
					   + "       (っ　≡つ＝つ \n"
					   + "./　 ) \n"
					   + "(/￣∪    \n ");
		System.out.println(poketmon.name + "(이)가 " + poketmon.skill + "으로 " + m.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 현재 체력: " + m.hp + "/" + m.maxHp);
	}
	
	
	void getExp(int exp) {
		System.out.println(exp + "의 경험치를 휙득하였습니다.");
		poketmon.exp += exp;
		System.out.println(poketmon.exp);
		while(100 <= poketmon.exp) {
			levelUp();
			poketmon.exp -= 100;
		}
	}
	
	void levelUp() {
		level++;
		maxHp += 5;
		att += 5;
		def += 5;
		hp = maxHp;
		System.out.println("레벨업!!");
	}
	
	void ThrowBall(Poketmon m) {
		System.out.println("어떤공을 던지시겠습니까?");
		System.out.println("1.몬스터볼\t2.슈퍼볼\t3.하이퍼볼\t4.가방나가기");
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
			int[] b1 = {0, 1, 0, 0, 1, 0, 0, 1, 0, 2};
			int result1 = b1[ran];
			stop();
			if(result1 == 0) {				
				System.out.println("몬스터를 놓쳤습니다.");
			}else if(result1 ==1){
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}else {
				System.out.println("몬스터가 도망갔습니다.");
			}
			break;
		case 2:
			System.out.println("공을 던졌습니다.");
			System.out.println("   ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n" + 
					"(·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n" + 
					"(つ　 <  \r\n" + 
					"｜　 _つ                                         \r\n" + 
					"`し´");
			int[] b2 = {0, 1, 0, 1, 1, 0, 1, 1, 0, 2};
			int result2 = b2[ran];
			stop();
			if(result2 == 0) {				
				System.out.println("몬스터를 놓쳤습니다.");
			}else if(result2 ==1){
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}else {
				System.out.println("몬스터가 도망갔습니다.");
				
			}
			break;
		case 3:
			System.out.println("공을 던졌습니다.");
			System.out.println("   ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n" + 
					"(·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n" + 
					"(つ　 <  \r\n" + 
					"｜　 _つ                                         \r\n" + 
					"`し´");
			int[] b3 = {0, 1, 1, 1, 1, 1, 0, 1, 1, 2};
			int result3 = b3[ran];
			stop();
			if(result3 == 0) {				
				System.out.println("몬스터를 놓쳤습니다.");
			}else if(result3 ==1){
				System.out.println("몬스터를 잡았습니다.");
				rtn = pc.save(m);
			}else {
				System.out.println("몬스터가 도망갔습니다.");
			}
			break;
		default:
			break;
		}
		return;
	}
	
	private void stop() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
