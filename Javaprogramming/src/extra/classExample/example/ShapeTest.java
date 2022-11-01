package extra.classExample.example;

import java.util.Arrays;

import d_array.Array;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(1.0);
		//Shape shape1 = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		//Shape shape2 = new Triangle(1.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		//Shape shape3 = new Rectangle(1.0);
		for (Shape s : shapes) {
			System.out.println(s);
		}
		Arrays.sort(s);
	}
	
}
