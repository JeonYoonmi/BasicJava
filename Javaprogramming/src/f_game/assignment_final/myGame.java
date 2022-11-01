package f_game.assignment_final;

import java.util.Arrays;
import f_game.assignment_final.ScanUtil;

public class myGame {

	Character ch;
	Character ch1;

	Charmander c;
	Squirtle s;
	Bulbasaur b;

	Lillipup l;
	Starly st;
	Growlithe g;
	Rattata r;
	Oddish o;
	Hoopa h;
	Poketmon p;
	
	Potion pp;
	SuperPotion sp;
	HyperPotion hp;
	ExpPotion ep;

	Poketmon m;

	{
		System.out.println("\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀⠀⠀⢀⣀⣄⣤⡀⠀⣠⡾⣁⠽⠃⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⢀⣤⠶⠛⠛⠉⠙⠛⢷⡄⠀⢰⣿⡏⢹⡿⠋⠻⣦⠿⠟⠛⠷⣦⣿⠉⠻⡟⠉⣿⠀⠀⣾⣿⠶⢶⣤⣤⣀⣀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠹⣿⣄⡀⠀⠐⣖⣮⠈⣿⣤⠬⣿⣇⠈⠀⢀⡞⡏⢰⡯⢋⡴⣿⡿⠀⠀⠃⠀⣿⠴⡒⠻⣿⡀⠘⣿⠁⣩⡏⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠘⠻⣿⡄⠀⠟⢋⣼⠋⣼⣧⡴⢻⡆⣀⡉⠻⢿⣄⣀⣉⣀⣼⡟⠀⣧⢠⢰⡇⢸⣿⠞⢸⡇⡄⠏⠀⡾⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⡀⠘⣿⣿⣄⠌⠉⣀⣾⠁⣿⠻⢷⣦⣍⣹⡏⠉⠿⠶⣾⢿⣿⡿⢷⣤⣀⣤⡞⢸⡇⠀⣸⠃⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣷⡀⣻⡏⠛⠛⠛⠹⠟⠛⠋⠀⠀⠈⠙⠻⠃⠀⠀⠀⠀⠀⠛⠛⠛⠟⠀⠛⠿⣾⣇⣠⡏⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                 ⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"");
		System.out.print("캐릭터의 이름을 입력해주세요> ");
		String name = ScanUtil.nextLine();
		String gender = null;

		do {
			System.out.println("성별을 골라주세요.");
			System.out.println("1.남\t2.여");
			int gendernum = ScanUtil.nextInt();
			if (gendernum == 1) {
				gender = "남";
			} else if (gendernum == 2) {
				gender = "여";
			} else {
				System.out.println("다시 선택해주세요.");
			}
		} while (gender == null);
		ch = new Character(name, gender);
		
		c = new Charmander();
		s = new Squirtle();
		b = new Bulbasaur();
		l = new Lillipup();
		st = new Starly();
		g = new Growlithe();
		r = new Rattata();
		o = new Oddish();
		h = new Hoopa();
		
		pp = new Potion();
		sp = new SuperPotion();
		hp = new HyperPotion();
		ep = new ExpPotion();

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
				input = ScanUtil.nextInt();

				switch (input) {
				case 1:
					System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠈⠉⠉⠁⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀⠀⠀⠀⠠⠀⠔⣆⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⠡⠈⠀⠀⠀⠀⠀⠀⠀⢸⡀⣿⡇⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡟⢘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⠏⠙⠃⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⡀⢘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣔⠠⢄⣀⠀⠀⠀⢀⣀⡠⠤⢆⡖⠁⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠎⢿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣶⣄⡙⢯⡉⠉⠁⠀⠀⢠⠜⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢹⠀⠸⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠦⠕⠢⠀⠈⠀⠀⠀⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⡿⠿⠛⠉⠀⠐⠠⠂⠀⠈⠢⡀⠀⠀⠀⠀⠀⠉⠙⠟⠿⠻⣿⣿⣿⣿⠟⠀⠀⠠⠀⢀⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣃⠀⠀⠀⠀⠀⠀⡣⠀⠀⠀⠀⠀⠐⢀⠀⠀⠀⠀⠀⠀⠀⠄⠀⣴⣿⣿⣏⠀⠀⠀⠀⠀⠀⣻⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣠⣤⣤⣤⣤⣴⠁⠀⠀⠀⠀⠀⠀⠀⢂⠒⠒⢤⣤⣤⣴⣶⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⢠⣾⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣴⢲⣦⣾⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣸⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⠿⠉⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⠟⠁⢠⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠑⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡟⠛⠛⠉⠀⠐⢖⣾⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡃⠀⠀⠀⠀⠈⠢⢄⠀⠀⠀⠀⠀⡂⠀⠀⠀⠀⠀⠀⣷⡄⢀⠤⢘⣱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⣠⣤⣼⣾⣶⣶⣤⣬⣆⠀⠀⠀⠀⠀⢯⣨⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⡿⡋⠂⠜⢀⣀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⢀⣘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣴⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣈⣢⣌⣲⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n");
					c.showPoketmonInfo(c);
					break;

				case 2:
					ch1 = new Character(c.name, c.CharacterInfo, c.hp, c.att, c.def, c.level, c.exp, c.skill, c.type);
					System.out.println(c.name + "를 선택하셨습니다.");
					System.out.println("물약과 볼은 지급됩니다.");
					break ch;

				default:
					break;
				}
				break;

			case 2:
				System.out.println("<<꼬부기>>");
				System.out.println("1.설명\t2.선택\t3.뒤로가기");
				input = ScanUtil.nextInt();

				switch (input) {
				case 1:
					System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⠉⠉⠙⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀⠀⠀⢠⣮⣀⣸⡀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⣼⣿⣿⠻⠇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⡏⠉⠀⠀⠀⠀⠀⠀⠀⠙⠉⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣏⠢⠤⠤⠒⠒⠒⠒⠠⠤⠤⠤⠤⠔⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠓⠦⢀⣀⠀⠀⠀⠀⠀⢀⣠⠴⠁⣰⡀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⡿⠛⠉⠁⠀⠀⠈⠀⠀⠀⠉⠉⠀⠉⡩⠉⠀⠀⠀⠈⢻⡲⣜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⡟⠉⡁⠀⠀⠀⠀⠐⠉⠀⠀⠀⡀⠀⠀⠀⡐⠀⠀⠀⠀⠀⠀⠀⡇⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⠟⠀⠂⠀⠀⠀⢀⠃⠀⠀⠀⠀⠀⠁⠀⢠⠁⡠⡄⠀⠀⠀⠀⡘⢹⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣷⣶⣶⣶⣶⡞⠁⠀⠀⠀⠀⠀⠀⢀⠄⠈⠀⠈⠀⢂⢄⡔⠁⠈⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣇⠀⠄⠀⣀⠀⠀⠀⠈⠉⠐⠂⠤⠔⠊⠁⠁⠀⣧⠀⢀⣼⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⡿⡌⠀⠀⠀⠀⠈⠀⠀⠀⠀⠈⠀⠀⠀⠀⡇⠀⢻⣶⣾⣿⣿⡟⠋⠀⠀⠀⠀⠈⠙⢿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡟⠁⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠁⠀⠀⠑⢼⣯⣾⣿⠋⠀⠀⠀⣀⣀⣀⠀⠀⠘⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⢄⣀⠀⠴⠀⡀⠀⠀⡠⠁⠀⠀⠀⠀⠀⠈⣿⠟⠁⠀⠀⠀⡎⠀⠀⠀⠀⠀⠀⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠑⢤⣀⠀⠈⠀⠐⢇⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⣸⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⡿⠛⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣾⣆⠀⠀⠀⠀⠀⠀⢸⣄⣀⡀⠀⠀⠈⠓⢦⣤⣤⣾⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣧⣶⣀⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣄⣀⣠⣤⣬⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + "");
					s.showPoketmonInfo(s);
					break;

				case 2:
					ch1 = new Character(s.name, s.CharacterInfo, s.hp, s.att, s.def, s.level, s.exp, s.skill, s.type);
					System.out.println(s.name + "를 선택하셨습니다.");
					System.out.println("물약과 볼은 지급됩니다.");
					break ch;

				default:
					break;
				}
				break;

			case 3:
				System.out.println("<<이상해씨>>");
				System.out.println("1.설명\t2.선택\t3.뒤로가기");
				input = ScanUtil.nextInt();

				switch (input) {
				case 1:
					System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⣻⠋⢱⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠋⠉⠉⠉⠉⠉⠉⠉⠈⢀⠠⠐⠁⠀⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⢀⠔⠒⠂⠈⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⡿⠉⠉⠙⣻⠿⠿⠟⠛⠿⠿⠿⢀⡀⠀⡀⠄⠜⠓⢢⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⠁⠀⠀⠈⠀⠀⠀⠀⣀⣀⣠⡀⠀⠀⠉⠀⠀⠀⠀⠈⠆⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⠙⢿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⠗⠁⠀⠀⠀⢠⣔⣭⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⠀⢀⣄⣤⣴⣾⣿⣿⢿⣿⠀⠘⢿⣿⣿⣿\r\n"
							+ "⣿⣿⠏⢀⠀⠀⢀⡄⠈⠛⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡆⠀⠘⣿⣿⣿\r\n"
							+ "⣿⣏⠈⢲⠀⠀⠘⠃⠀⠀⣠⡀⠀⠀⡀⠀⠀⠐⠞⢷⣆⠀⠀⠀⠀⡅⠙⢿⣿⣿⣿⣿⣿⠿⠋⠁⠇⠀⠀⢻⣿⣿\r\n"
							+ "⡟⡃⢸⡀⠀⠀⠀⠀⠠⣼⣿⠁⠀⠀⠁⠐⠁⢸⠀⠀⢹⣆⠀⠀⠀⢁⠀⣤⣽⣿⣿⡇⠐⣢⣴⢶⠀⠀⠀⣸⣿⣿\r\n"
							+ "⡇⠃⢘⢃⠀⠀⠀⠀⠀⠀⠙⠁⠀⠀⠀⠆⠀⢸⣷⠀⠸⠟⠀⠀⠀⠘⠀⠹⣿⣿⣿⣷⣾⣿⣿⡟⠴⠀⣾⣿⣿⣿\r\n"
							+ "⡇⡄⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠆⠀⠘⠤⠄⠒⢚⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⠙⢿⣶⣶⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣮⡐⠢⣠⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠤⡤⠒⠋⠀⢀⠄⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠹⣿⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣷⣬⣙⠬⢍⠀⠀⠀⠀⠉⠉⠉⢁⡤⠖⠉⠀⠀⣀⠄⠊⠀⠀⠀⠀⠀⡀⢀⠄⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⠀⠑⠒⠠⢍⣒⢒⣒⣊⢁⣁⡀⠤⠰⠒⢯⠁⠀⣀⡄⠀⠀⠀⠀⡧⢁⣴⣾⣿⠀⠀⠀⢹⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣄⡰⠐⣱⠀⠀⠐⢄⡀⠀⠀⠀⠀⠀⠠⣃⠠⣀⠱⠔⠀⠀⠀⢰⠃⠰⣿⣿⣿⡇⠀⠀⢸⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⡀⠘⡿⠁⠀⠀⠀⢈⣿⣶⣤⢤⣤⣾⠁⠀⠏⠀⠀⠀⠀⢀⢮⠀⠀⠈⠛⠛⠁⠀⠀⣸⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣷⡉⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣜⠻⡿⠟⠀⠀⠀⠀⣠⣿⣿⡄⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣷⣦⣰⣄⣵⣶⣿⣿⣿⣿⣿⣿⡟⢄⠀⢄⡠⣀⣠⣶⣿⣿⣿⣿⣵⣔⣐⣴⣒⣴⣿⣿⣿⣿\r\n"
							+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n");
					b.showPoketmonInfo(b);
					break;

				case 2:
					ch1 = new Character(b.name, b.CharacterInfo, b.hp, b.att, b.def, b.level, b.exp, b.skill, b.type);
					System.out.println(p.name + "를 선택하셨습니다.");
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
			System.out.println("1.내정보\t\t2.풀숲\t\t3.가방\t\t4.PC\t\t0.종료");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				ch.showcharacterStatus();
				ch1.showPoketmonStatus();
				ch1.showItemStatus();
				break;
			case 2:
				hunt();
				break;
			case 3:
				ch1.showItemStatus();
				System.out.println("1.아이템 사용하기\t\t2.가방나가기");
				input = ScanUtil.nextInt();
				switch (input) {
				case 1:
					it: while (true) {
						System.out.println("어떤 아이템을 사용하시겠습니까?");
						System.out.println("1.상처약\t\t2.좋은상처약\t\t3.고급상처약\t\t4.경험치물약\t\t5.가방나가기");
						input = ScanUtil.nextInt();
						if (input == 1) {
							pp.showItemInfo(pp);
							System.out.println("몇개를 사용하시겠습니까?");
							int input2 = ScanUtil.nextInt();
							ch1.useItems(pp, input2);
						} else if (input == 2) {
							sp.showItemInfo(sp);
							System.out.println("몇개를 사용하시겠습니까?");
							int input3 = ScanUtil.nextInt();
							ch1.useItems(sp, input3);
						} else if (input == 3) {
							hp.showItemInfo(hp);
							System.out.println("몇개를 사용하시겠습니까?");
							int input4 = ScanUtil.nextInt();
							ch1.useItems(hp, input4);
						} else if (input == 4) {
							ep.showItemInfo(ep);
							System.out.println("몇개를 사용하시겠습니까?");
							int input5 = ScanUtil.nextInt();
							ch1.useItems(ep, input5);
						} else {
							break it;
						}

					}
					break;
				default:
					break;
				}
				break;
			default:
				break;
			case 4:
				System.out.println("PC에 접속하셨습니다.");
				System.out.print("잡은 포켓몬: ");
				System.out.println(Arrays.toString(ch.rtn));
				break;
			case 0:
				System.out.println("게임이 종료되었습니다.");
				System.exit(0);
			}
		}

	}

	void hunt() {
		int num = (int) (Math.random() * 6);
		Poketmon[] random = { l, st, g, r, o, h};
		m = random[num];
		System.out.println(m.name + "(이)가 등장했다!");
		System.out.println(m.name + "체력: " + m.hp + " 공격력: " + m.att + " 방어력: " + m.def);
		System.out.println(ch1.name1 + "체력: " + ch1.hp + " 공격력: " + ch1.att + " 방어력: " + ch1.def);

		int input = 0;
		battle: while (true) {
			System.out.println("1.공격\t\t2.가방\t\t3.도망");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				ch1.attack(m);
				if (m.hp <= 0) {
					System.out.println(m.name + "(은)는 쓰러졌습니다.");
					ch1.getExp(m.exp, 1);
					l = new Lillipup();
					st = new Starly();
					g = new Growlithe();
					r = new Rattata();
					o = new Oddish();
					break battle;
				}
				stop();
				m.attack(ch1);
				if (ch1.hp <= 0) {
					System.out.println(ch1.name1 + "가 기절했습니다.");
					System.out.println("지쳐서 기절헤버린 포켓몬을 데리고 " + ch.name + "은 급하게 포켓몬센터로 돌아갔다.");
					stop();
					System.out.println("일단 포켓몬을 회복시킵시다.");
					stop();
					System.out.println(ch1.name1 + "(이)가 회복되었습니다.");
					ch1.hp = ch1.maxHp;
					break battle;
				}
				break;
			case 2:
				System.out.println("1.몬스터볼\t\t2.상처약\t\t3.가방나가기");
				int input2 = ScanUtil.nextInt();
				switch (input2) {
				case 1:
					ch.ThrowBall(m);
					break battle;
				case 2:
					while (true) {
						System.out.println("어떤 아이템을 사용하시겠습니까?");
						System.out.println("1.상처약\t\t2.좋은상처약\t\t3.고급상처약\t\t4.경험치물약\t\t5.가방나가기");
						int input3 = ScanUtil.nextInt();
						int input4;
						if (input3 == 1) {
							System.out.println("몇개를 사용하시겠습니까?");
							input4 = ScanUtil.nextInt();
							pp.showItemInfo(pp);
							ch1.useItems(pp, input4);
						} else if (input3 == 2) {
							System.out.println("몇개를 사용하시겠습니까?");
							input4 = ScanUtil.nextInt();
							sp.showItemInfo(sp);
							ch1.useItems(sp, input4);
						} else if (input3 == 3) {
							System.out.println("몇개를 사용하시겠습니까?");
							input4 = ScanUtil.nextInt();
							hp.showItemInfo(hp);
							ch1.useItems(hp, input4);
						} else if (input3 == 4) {
							System.out.println("몇개를 사용하시겠습니까?");
							input4 = ScanUtil.nextInt();
							ep.showItemInfo(ep);
							ch1.useItems(ep, input4);
						} else {
							break;
						}
					}
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("도망쳤습니다.");
				break battle;
			}
		}
	}

	private void stop() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
