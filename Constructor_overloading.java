package Training;

class Box {
	float length, breadth;

	// default constructor
	public Box() {
		length = 2;
		breadth = 5;
	}

	// Parameterized constructor
	public Box(float x, float y) {
		length = x;
		breadth = y;
	}

	// Parameterized constructor
	Box(float x) {
		length = breadth = x;
	}

	float area() {
		return length * breadth;
	}
}

public class Constructor_overloading {

	public static void main(String[] args) {
		Box o = new Box();
		System.out.println("Area : " + o.area());

		Box o1 = new Box(3, 6);
		System.out.println("Area : " + o1.area());

		Box o2 = new Box(3);
		System.out.println("Area : " + o2.area());

	}

}
