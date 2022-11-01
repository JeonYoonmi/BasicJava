package g_opp2;
 //다형성
public class Store {

	public static void main(String[] args) {
		Desktop d = new Desktop();
		AirCon ac = new AirCon();
		TV tv = new TV();
		
		Customer c = new Customer();
		
		
//		Desktop d = new Desktop();
//		Product p = new Desktop();
		
		//c.buy() 안에 Product 타입이 들어가야하는데 d, ac, tv가 들어가는건 서로 상속관계에 있기 때문
		c.buy(d);
		c.buy(ac);
		c.buy(tv);
		

	}

}

class Product{
	String name; //이름
	int price; //가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
}

class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 1000000);
	}
}

class AirCon extends Product{
	AirCon(){
		super("LG 에어컨", 2000000);
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 3000000);
	}
}

class Customer{
	int money = 10000000;
	Product[] item = new Product[10]; //다형성
	
	void buy(Product p) { //다형성
		//Desktop d = (Desktop)p;
		if(money < p.price) {
			System.out.println("잔돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				item[i] = p;
				break;				
			}
		}
		System.out.println(p.name + "을 구매했습니다.");
	}
}










