package extra.classExample.example;

public class Triangle extends Shape {

	private double side;

	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return Math.sqrt(3) / 4.0 * side * side;
	}
	
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	@Override
	public String toString() {
		return String.format("삼각형, %f, %f", perimeter(), area());
	}
	
}
