// Toggle case means changing upper case into lower case & lower case into upper case
package Training;

public class Convert_string_tooglecase {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("saRath kuMaar traiNing");
		System.out.println("Original string      : " + a);

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
				int c = (int) a.charAt(i) + 32;
				a.setCharAt(i, (char) c);
			} else if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
				int c = (int) a.charAt(i) - 32;
				a.setCharAt(i, (char) c);
			}
		}
		System.out.println("Togle case  string   : " + a);

	}

}
