package f_game.assignment;

public class Item {
	
	String name;
	int probability;
	int hpheal;
	int expadd;
	
	Item(String name, int hpheal, int expadd){
		this.name = name;
		this.hpheal = hpheal;
		this.expadd = expadd;
	}
	
	Item(String name, int probability){
		this.name = name;
		this.probability = probability;
	}
	
	public void showItemInfo(Item item) {
		String info = name + "[";
		if(0 < probability) info += "잡힐 확률: " + probability + "]";
		if(0 < hpheal) info += "회복량: " + hpheal + "]";
		if(0 < expadd) info += "경험치량: " + expadd + "]";
		
		System.out.println(info);
	}


}

class PoketBall extends Item{
	PoketBall(){
		super("몬스터볼", 30);
	}
}

class GreatBall extends Item{
	GreatBall(){
		super("슈퍼볼", 50);
	}
}

class UltraBall extends Item{
	UltraBall(){
		super("하이퍼볼", 70);
	}
}

class Potion extends Item{
	Potion(){
		super("상처약", 10, 0);
	}
}

class SuperPotion extends Item{
	SuperPotion() {
		super("좋은상처약", 20, 0);
	}
}

class HyperPotion extends Item{
	HyperPotion() {
		super("고급상처약", 30, 0);
	}
}

class ExpPotion extends Item{
	ExpPotion(){
		super("경험치물약", 0, 10);
	}
}
