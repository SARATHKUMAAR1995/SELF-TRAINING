//To create a method nesting
package Training;

class demo {
	private int m, n;

	demo(int x, int y) {
		m = x;
		n = y;
	}

	int largest() {
		if (m > n)
			return m;
		else
			return n;
	}

	// below display() method calls another method largest() is called nested method
	void display() {
		int large = largest();
		System.out.println("The Greatest Number is : " + large);
	}

}

public class Method_nesting {

	public static void main(String[] args) {

		demo o = new demo(10, 20);
		o.display();

	}

}
