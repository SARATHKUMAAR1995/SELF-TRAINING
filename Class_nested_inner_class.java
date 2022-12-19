// When a class contains another class inside is called Nested inner class
package Training;

class outer {
	int a = 50;

	class inner {
		int b = 58;

		void innerDisplay() {
			System.out.println("A : " + a);
			System.out.println("B : " + b);
		}

		void print() {
			System.out.println("Test print");
		}

	}

	void outerDisplay() {
		inner i = new inner();
		i.innerDisplay();
		System.out.println("B from inner Class by Outer Display : " + i.b);
	}
}

public class Class_nested_inner_class {

	public static void main(String[] args) {

		outer o = new outer();
		o.outerDisplay();
		outer.inner i = new outer().new inner();
		i.innerDisplay();
		i.print();

	}

}
