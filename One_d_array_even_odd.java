package Training;

import java.util.*;

public class One_d_array_even_odd {

	public static void main(String[] args) {
		int e = 0, o = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = s.nextInt();
		int a[] = new int[n];
		// input for loop
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a[" + i + "] index value :");
			a[i] = s.nextInt();
		}
		// to find even or odd count
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		// to find odd numbers
		System.out.println("Total odd numbera are : " + o);
		System.out.println("Odd numbers are : ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(" " + a[i]);
			}}
			System.out.println("Total even numbera are : " + e);
			System.out.println("Even numbers are : ");
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					System.out.println(" " + a[i]);
				}
			}
		}

	}
