package SELF_TRAINING;

public class RecursiveFunction {
	public static int factorial(int no) {
		if(no == 0) {
			return 1;
		}
		else {
			System.out.println(no);
			return no * factorial(no - 1);
		}
	}

	public static void main(String[] args) {
		int a = factorial(5);
		System.out.println(a);

	}

}
