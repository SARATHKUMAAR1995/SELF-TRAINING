package Training;

//Single Inheritance

class Father {
	public void house() {
		System.out.println("Have Own 2BHK House.");
	}
}

class Son extends Father {
	public void car() {
		System.out.println("Have Own Audi Car.");
	}
}

public class Inheritance_single {

	public static void main(String[] args) {

		Son o = new Son();
		o.car();
		o.house();

	}

}
