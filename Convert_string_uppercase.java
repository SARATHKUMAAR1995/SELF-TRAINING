// program to convert string to uppercase
package Training;

public class Convert_string_uppercase {
	public static void main(String args[]) {
		StringBuilder a = new StringBuilder("Sarath kumaar training");
		System.out.println("Original input   : " + a);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
				// to find uppercase using below code 97(a)-32=65(A) unicode
				int c = (int) a.charAt(i) - 32;
				// to set char c to a
				a.setCharAt(i, (char) c);
			}
		}
		System.out.println("Converted output : " + a);

	}
}