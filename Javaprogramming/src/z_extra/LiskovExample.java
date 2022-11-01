package z_extra;

import java.util.ArrayList;
import java.util.List;

import extra.classExample.Bus;
import extra.classExample.Taxi;
import extra.classExample.Vehicle;

public class LiskovExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Vehicle bus = new Bus();
//		Vehicle Taxi = new Taxi();
		Vehicle bus = new Taxi();
		
		if(bus instanceof Bus) {
			((Bus)bus).fare(100);
			System.out.println("캐스팅 되었습니다.");
		}else {
			System.out.println("캐스팅할 수 없습니다.");
		}
//		bus.fare(100); //안됨
//		((Bus)bus).fare(100); //캐스팅
		((Bus)bus).fare(100); //캐스팅오류
		
		
		
//		test(new Bus());
//		test(new Taxi());
//		test(new Vehicle());
	}
	
	private static void test(Vehicle vehicle) {//Vehicle vehicle = new Bus();
		
	}
}
