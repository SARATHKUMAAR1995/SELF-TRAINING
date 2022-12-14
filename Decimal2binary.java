package Training;

import java.util.*;

public class Decimal2binary {
	public static void decimal2binary(int n) {
		int[] binarynum = new int[1000];
		int i = 0;
		while (n > 0) {
			binarynum[i] = n % 2; // o/p --> 0011 for 12
			n = n / 2;
			i++;
		}
		// to reversae the array so o\p -->1100 for 12
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binarynum[j]);

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the decimal no : ");
		int n = s.nextInt();
		System.out.println("Decimal no : " + n);
		System.out.print("Binary no : ");
		decimal2binary(n);

	}

}
