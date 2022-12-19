package Training;

interface interDemo {
	final static int A = 25;

	public abstract void fun1();

	public abstract void fun2();

	public static void fun3() {
		System.out.println("I am Fun-3");
	}

	private void fun6() {
		System.out.println("Fun-6");
	}

	default void fun7() {
		fun6();
	}

	default void fun5() {
		System.out.println("Fun-5");
	}
}

interface interDemo2 extends interDemo {
	void fun4();
}

class TestInter implements interDemo2 {

	public void fun1() {
		System.out.println("Fun-1");
	}

	public void fun2() {
		System.out.println("Fun-2");
	}

	public void fun4() {
		System.out.println("Fun-4");
	}
}

public class Interface1 {

	public static void main(String[] args) {

		System.out.println("A : " + interDemo.A);
		TestInter o = new TestInter();
		o.fun1();

		o.fun2();
		interDemo.fun3();
		o.fun4();
		o.fun5();
		o.fun7();

	}

}
