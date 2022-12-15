// To add a complex number using copy constructor
package Training;

class complex {
	private int real, img;

	public complex() {
		this.real = 0;
		this.img = 0;
		System.out.println("Default constructor");
	}

	public complex(int r, int i) {
		this.real = r;
		this.img = i;
		System.out.println("Parameterized constructor");
	}

	// copy constructor
	public complex(complex o2) {
		System.out.println("Copy constructor");
		this.real = o2.real;
		this.img = o2.img;
	}

	// toString - inbuilt function which returns when an object is created
	public String toString() {
		return "(" + real + "+" + img + "i)";
	}
}

public class Constructor_complex_number {

	public static void main(String[] args) {
		complex o1 = new complex();
		System.out.println("Object 1 : " + o1);

		complex o2 = new complex(3, 2);
		System.out.println("Object 2 : " + o2);

		complex o3 = new complex(o2);
		System.out.println("Object 3 : " + o3);

	}

}
