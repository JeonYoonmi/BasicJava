package extra.classExample.example;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
	@Override
	public String toString() {
		return String.format("사각형, %f, %f", perimeter(), area());
	}
	
}
