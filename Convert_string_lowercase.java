package Training;

public class Convert_string_lowercase {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("SARATH KUMAAR TRAINING");
		System.out.println("Original input   : " + a);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
				// to find uppercase using below code 65(A)+32=97(a) unicode
				int c = (int) a.charAt(i) + 32;
				// to set char c to a
				a.setCharAt(i, (char) c);
			}
		}
		System.out.println("Converted output : " + a);

	}

}
