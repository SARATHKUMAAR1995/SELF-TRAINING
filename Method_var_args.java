// To create a method with different variable arguments

package Training;

public class Method_var_args {
	public static void getnames(String... names) {
		for (String name : names) {
			System.out.println(name);
		}

	}

	public static void main(String[] args) {
		getnames("Ram", "Sam", "Ravi", "Hari");

	}

}
