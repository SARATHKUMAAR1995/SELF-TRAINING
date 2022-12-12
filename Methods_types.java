package Training;

public class Methods_types {
	// No Return W/o args
	public void add() {
		int a = 123;
		int b = 10;
		System.out.println("Addition    : " + (a + b));
	}

	// No Return With Args
	public void sub(int x, int y) {
		System.out.println("Subtraction : " + (x - y));
	}

	// Return Without Args
	public int mul() {
		int a = 123;
		int b = 10;
		return a * b;
	}

	// Return With Args
	public float div(int x, int y) {
		return (x / y);
	}

	// Recursion Function
	// means when a function calls itself again & again to complete function
	public int factorial(int n)// 5! =1*2*3*4*5=120
	{
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		Methods_types o = new Methods_types();
		o.add();
		o.sub(123, 10);
		System.out.println("Muli        : " + o.mul());
		System.out.println("Division    : " + o.div(123, 10));
		System.out.println("Factorial   : " + o.factorial(5));

	}

}
