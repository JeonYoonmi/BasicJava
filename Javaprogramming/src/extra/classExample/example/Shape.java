package extra.classExample.example;

//public class Shape {
//	//넓이
//	public double area() {
//		return 0;
//	}
//	
//	//둘레의 길이
//	public double perimeter() {
//		return 0;
//	}
//}

public abstract class Shape implements Comparable<T>{ //추상클래스
	//넓이
	public abstract double area();
	
	//둘레의 길이
	public abstract double perimeter();
	
	public int compareTo(shape o) {
		return 0;
	}
	
}