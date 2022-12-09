package Training;

public class String_concept {

	public static void main(String[] args) {
		String a = "Sarath Kumaar";
		String b = "sarath kumaar";
		String c = "Sarath Kumaar";
		String d = "SARATH KUMAAR";
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		// in python it is id but in java it is hash code(
		//hash code means internal memory address of an object)
		System.out.println("a hashcode : "+a.hashCode());
		System.out.println("b hashcode : "+b.hashCode());
		System.out.println("c hashcode : "+c.hashCode()); // a & c same
		
		// to find equal hashcodes
		System.out.println("Equals a & b :"+a.equals(b));
		System.out.println("Equals a & c :"+a.equals(c));
		
		// to ignore upper or lower case
		System.out.println("Equals ignore case : "+a.equalsIgnoreCase(b));
		System.out.println("Equals ignore case : "+a.equalsIgnoreCase(c));
		
		// to find length
		System.out.println("Length : "+a.length());
		
		// to print index position
		System.out.println("CharAt 0: "+a.charAt(0));
		System.out.println("CharAt 1: "+a.charAt(1));
		System.out.println("CharAt 2: "+a.charAt(2));
		System.out.println("CharAt 3: "+a.charAt(3));
		System.out.println("CharAt 4: "+a.charAt(4));
		System.out.println("CharAt 5: "+a.charAt(5));
		
		// to convert to upper or lower case  
		System.out.println("Upper case : "+a.toUpperCase());
		System.out.println("Lower case : "+d.toLowerCase());
		
		// to replace
		System.out.println("Replace : "+a.replace("Sarath", "N.Sarath"));
		
		// to check if a string contains a specified value
		System.out.println("Contains : "+a.contains("Sarath"));
		System.out.println("Contains : "+a.contains("kumaar")); // k is lowercase
		
		// to check if a string is Empty
		System.out.println("Empty : "+a.isEmpty());
		
		// to find ends with or starts with
		System.out.println("EndsWith : "+a.endsWith("aar"));
		System.out.println("EndsWith : "+a.endsWith("xyz"));
		System.out.println("StartsWith : "+a.startsWith("xyz"));
		System.out.println("StartsWith : "+a.startsWith("Sar"));
		
		// to find the values using index
		System.out.println("Substring     5: "+a.substring(5));
		System.out.println("Substring     4: "+a.substring(4));
		System.out.println("Substring     3: "+a.substring(3));
		System.out.println("Substring     2: "+a.substring(2));
		System.out.println("Substring     1: "+a.substring(1));
		System.out.println("Substring     0: "+a.substring(0));
		System.out.println("Substring (0,6): "+a.substring(0,6));
		
		// to convert a string to a character array
		char char_array[]= a.toCharArray();
		for(char e : char_array)
		{
			System.out.print(e+" ");
		}
		
		// trim to remove unwanted space at front & back
		String f = "  Sarath  ";
		System.out.println("Length :"+f.length());
		System.out.println("f:"+f);
		System.out.println("f after trim:"+f.trim());
		System.out.println("f trim length:"+f.trim().length());
		

	}

}
