package Training;

public class String_builder {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("Tutor");
		System.out.println(a);

		a.append(" Joes");
		System.out.println(a);

		a.insert(10, " Computer");
		System.out.println(a);

		a.replace(9, 11, "@@@");
		System.out.println(a);

		a.delete(9, 11);
		System.out.println(a);

		a.reverse();
		System.out.println(a);

		// to find the character at the specified position
		System.out.println(a.charAt(2));

		// to find length
		System.out.println(a.length());

		// to find the values using index
		System.out.println(a.substring(0));
		System.out.println(a.substring(0, 5));

		// to set change the index position
		a.setCharAt(0, '@');
		System.out.println(a);

		// to find the memory size use capacity keyword
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());

	}

}
