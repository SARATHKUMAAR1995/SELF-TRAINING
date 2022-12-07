package Training;

import java.util.*;


public class One_d_array_Scanner {

	public static void main(String[] args) {
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		n= s.nextInt();
		System.out.println("Enter the "+n+" array elements: ");
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array values are : ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
