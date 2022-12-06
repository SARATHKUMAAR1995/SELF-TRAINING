package Training;

import java.util.*;

public class Strong_number {

	public static void main(String[] args) {
		int num, originalnum, rem, fact, i, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = s.nextInt();
		originalnum = num;
		while (num > 0) {
			rem = num % 10;
			fact = 1;
			for (i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num = num / 10;
		}
		if (sum == originalnum) {
			System.out.println(originalnum + " is a strong number");
		} else {
			System.out.println(originalnum + " is not a strong number");
		}

	}

}
