// return array using method
package Training;

import java.util.*;
import java.util.Arrays;

public class Method_array {
	public static int[] sortarray() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value " + i + " :");
			a[i] = s.nextInt();
		}
		// To sort in ascending
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {

		int arr[] = sortarray();
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
