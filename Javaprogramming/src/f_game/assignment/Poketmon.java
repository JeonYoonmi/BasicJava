package f_game.assignment;

public class Poketmon {
	
	String name;
	String info;
	String CharacterInfo;
	int hp;	
	int att;		
	int def;
	int level;
	int exp;
	int maxHp = 100;	
	String skill;
	String type;
	
	Poketmon(String name, String CharacterInfo, int hp, int att, int def, int level, int exp, String skill, String type){
		this.name = name;
		this.CharacterInfo = CharacterInfo;
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.att = att;
		this.def = def;
		this.level = level;
		this.exp = exp;
		this.skill = skill;
		this.type = type;
	}
	
	

	public void showPoketmonInfo() {
		this.info = "이름: " + name + "\n";
		info += "설명: " + CharacterInfo + "\n";
		info += "속성: " + type + "\n";
		if(0 < hp) info += "체력: " + hp + "\n";
		if(0 < att) info += "공격력: " + att + "\n";
		if(0 < def) info += "방어력: " + def + "\n";
		if(0 < level) info += "레벨: " + level + "\n";
		if(0 <= exp) info += "경험치: " + "(" + exp + "/100" + ")" + "\n";
		info += "스킬 이름: " + skill + "\n";
		if(0 < att) info += "스킬 공격력: " + att;
		
		System.out.println(info);
	}
	
	void attack(Character ch) {
		int damage = att - ch.poketmon.def;
		damage = damage <= 0 ? 1 : damage;
		ch.poketmon.hp -= damage <= ch.poketmon.hp ? damage : ch.poketmon.hp;
		System.out.println("   　                 n  Λ＿Λ \n"
						 + "\t(ﾖ(´･ω･｀)  \n"
						 + "      ≡　y　 と丿 \n"
						 + "      ≡（_ﾉ　ノ  \n"
						 + "       ≡(ノ´");
		System.out.println(name + "(이)가 " + skill + "으로 " + ch.poketmon.name + "에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(ch.poketmon.name + "의 현재 체력: " + ch.poketmon.hp + "/" + ch.poketmon.maxHp);
	}
	
}


class Charmander extends Poketmon{
	Charmander(){
		super("파이리", "태어날 때부터 꼬리의 불꽃이 타오르고 있다. 불꽃이 꺼지면 그 생명이 다하고 만다.", 39, 52, 43, 1, 0, "불꽃세례", "불꽃");
	}
	
}

class Squirtle extends Poketmon{
	Squirtle(){
		super("꼬부기", "긴 목을 등껍질 안에 움추릴 때 강한 물대포를 발사한다.", 44, 48, 65, 1, 0, "물대포", "물");
	}
	
}

class Bulbasaur extends Poketmon{
	Bulbasaur(){
		super("이상해씨", "태어날 때부터 등에 식물의 씨앗이 있어 조금씩 크게 자란다.", 45, 45, 49, 1, 0, "입날가르기", "풀/독");
	}
	
}

class Lillipup extends Poketmon{
	Lillipup(){
		super("요테리", "용맹한 포켓몬이지만 상대의 강함을 확인하고 싸움을 피하는 영리함도 함께 갖추고 있다.", 45, 60, 45, 1, 10, "몸통박치기", "노말");
	}
}

class Starly extends Poketmon{
	Starly(){
		super("찌르꼬", "무리를 만드는 것으로 한 마리로는 약하다는 단점을 커버하고 있지만 무리가 커지면 다투기 시작한다.", 30, 55, 30, 1, 10, "쪼기", "노말/비행");
	}
}

class Growlithe extends Poketmon {
	Growlithe() {
		super("가디", "사람을 잘 따르는 충실한 성격이다. 적에게는 짖거나 물며 쫓아내려고 한다.", 55, 70, 45, 1, 10, "불꽃세례", "불꽃");
	}

}

class Rattata extends Poketmon {
	Rattata() {
		super("꼬렛", "송곳니는 길고 날카롭다. 평생 계속 뻗어나가서 단단한 것을 깎는다.", 30, 56, 35, 1, 10, "물기", "노말");
	}
}

class Oddish extends Poketmon{
	Oddish() {
		super("뚜벅초", "별명 걸어 다니는 독초. 밤이 되면 2개의 뿌리로 300m나 걷는다고 한다.", 45, 50, 55, 1, 10, "입날가르기", "풀/독");
	}
}
