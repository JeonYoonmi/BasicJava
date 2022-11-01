package g_opp2;

public abstract class Animal {

	abstract void sound();
	
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍!");
		
	}
	
}

class cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹~");
		
	}
	
}

class bird extends Animal{

	@Override
	void sound() {
		System.out.println("짹짹");
		
	}
	
}
