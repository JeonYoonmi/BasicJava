package f_game.assignment;

import java.util.Arrays;

import e_oop.ScanUtil;

public class myGame {

	Character ch;
	Item[] items;
	Charmander c;
	Squirtle s;
	Bulbasaur b;

	Lillipup l;
	Starly st;
	Growlithe g;
	Rattata r;
	Oddish o;
	Poketmon p;
	
	PoketBall P;
	GreatBall G;
	UltraBall U;
	Potion pp;
	SuperPotion sp;
	HyperPotion hp;
	ExpPotion xp;
	
	PC pc;
	Poketmon m;
	
	{
		System.out.print("캐릭터의 이름을 입력해주세요> ");
		String name = ScanUtil.nextLine();
		String gender = null;
		do {			
			System.out.println("성별을 골라주세요.");
			System.out.println("1.남\t2.여");
			int gendernum = ScanUtil.nextInt();
			if(gendernum == 1) {
				gender = "남";
			}else if(gendernum == 2) {
				gender = "여";
			}else {
				System.out.println("다시 선택해주세요.");
			}
		}while(gender == null);
		ch = new Character(name, gender);
		items = new Item[10];
		c = new Charmander();
		s = new Squirtle();
		b = new Bulbasaur();
		l = new Lillipup();
		st = new Starly();
		g = new Growlithe();
		r = new Rattata();
		o = new Oddish();
		P = new PoketBall();
		G = new GreatBall();
		U = new UltraBall();
		pp = new Potion();
		sp = new SuperPotion();
		hp = new HyperPotion();
		xp = new ExpPotion();
		pc = new PC();
	}
	
	public static void main(String[] args) {
		new myGame().start();
	}
	

	void start() {
		ch: while (true) {
			System.out.println("스타팅 포켓몬을 선택해주세요");
			System.out.println("1.파이리\t2.꼬부기\t3.이상해씨");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				System.out.println("<<파이리>>");
				System.out.println("1.설명\t2.선택\t3.뒤로가기");
				int input2 = ScanUtil.nextInt();

				switch (input2) {
				case 1:
					c.showPoketmonInfo();
					break;

				case 2:
					ch.getPoketmon(c);
					System.out.println("물약과 볼은 지급됩니다.");
					break ch;

				default:
					break;
				}
				break;

			case 2:
				System.out.println("<<꼬부기>>");
				System.out.println("1.설명\t2.선택\t3.뒤로가기");
				int input3 = ScanUtil.nextInt();

				switch (input3) {
				case 1:
					s.showPoketmonInfo();
					break;

				case 2:
					ch.getPoketmon(s);
					System.out.println("물약과 볼은 지급됩니다.");
					break ch;

				default:
					break;
				}
				break;

			case 3:
				System.out.println("<<이상해씨>>");
				System.out.println("1.설명\t2.선택\t3.뒤로가기");
				int input4 = ScanUtil.nextInt();

				switch (input4) {
				case 1:
					b.showPoketmonInfo();
					break;

				case 2:
					ch.getPoketmon(b);
					System.out.println("물약과 볼은 지급됩니다.");
					break ch;

				default:
					break;
				}
				break;

			default:
				break;
			}
		}
	
	while (true) {
		System.out.println("1.내정보\t2.풀숲\t3.PC\t0.종료");
		int input5 = ScanUtil.nextInt();
			switch (input5) {
			case 1:
				ch.showStatus();
				break;
			case 2:
				hunt();
				break;
			case 3:
				System.out.println("PC에 접속하셨습니다.");
				System.out.print("잡은 포켓몬: ");
				System.out.println(Arrays.toString(ch.rtn));
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}

	}
	
	
	void hunt() {
		int num = (int) (Math.random() * 5);
		Poketmon[] random = {l,st,g,r,o};
		m = random[num];
		System.out.println(m.name + "(이)가 등장했다!");
		System.out.println(m.name + "체력: " + m.hp + " 공격력: " + m.att + " 방어력: " + m.def);
		System.out.println(ch.poketmon.name + "체력: " + ch.poketmon.hp + " 공격력: " + ch.poketmon.att + " 방어력: " + ch.poketmon.def);
		
		int input = 0;
		battle : while(true) {
			System.out.println("1.공격\t2.가방\t3.도망");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				ch.attack(m);
				if(m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다.");
					ch.getExp(m.exp);
					break battle;
				}
				m.attack(ch);
				break;
			case 2:
				ch.ThrowBall(m);
				break battle;
			case 3:
				System.out.println("도망쳤습니다.");
				break battle;
			}
		}
	}
	
	
}
