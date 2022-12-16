package Training;

//Multilevel Inheritance

class GrandFather {
	public void house() {
		System.out.println("3 BHK House.");
	}
}

class father_ extends GrandFather {
	public void land() {
		System.out.println("5 Arcs of Land..");
	}
}

class son1 extends father_ {
	public void car() {
		System.out.println("Own Audi Car..");
	}
}

public class Inheritance_multilevel {

	public static void main(String[] args) {

		son1 o1 = new son1();
		o1.car();
		o1.house();
		o1.land();
	}

}
