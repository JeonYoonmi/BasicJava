package f_game.assignment_final;

public class Item {
	
	String name;
	int probability;
	int hpheal;
	int expadd;
	
	Character ch;
	
	Item(String name, int probability){
		this.name = name;
		this.probability = probability;
	}
	
	Item(String name, int hpheal, int expadd){
		this.name = name;
		this.hpheal = hpheal;
		this.expadd = expadd;
	}
	
	public void showItemInfo(Item item) {
		String info = item.name + "[";
		if(0 < item.probability) info += "잡힐 확률: " + item.probability + "]";
		if(0 < item.hpheal) info += "회복량: " + item.hpheal + "]";
		if(0 < item.expadd) info += "경험치량: " + item.expadd + "]";
		
		System.out.println(info);
	}

}

class PoketBall extends Item{
	public PoketBall() {
		super("몬스터볼", 30);
	}
}

class GreatBall extends Item{
	public GreatBall() {
		super("슈퍼볼", 50);
	}
}

class UltraBall extends Item{
	public UltraBall() {
		super("하이퍼볼", 70);
	}
}

class Potion extends Item{
	public Potion() {
		super("상처약", 10, 0);
	}

}

class SuperPotion extends Item{
	public SuperPotion() {
		super("좋은상처약", 20, 0);
	}

}

class HyperPotion extends Item{
	public HyperPotion() {
		super("고급상처약", 30, 0);
	}
}

class ExpPotion extends Item{
	public ExpPotion() {
		super("경험치물약", 0, 10);
	}
}
