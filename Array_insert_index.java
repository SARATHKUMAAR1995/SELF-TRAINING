package Training;
import java.util.*;
import java.util.Arrays;

public class Array_insert_index {

	public static void main(String[] args) {
		System.out.print("Enter array limit :");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a[" + i + "] index value :");
			a[i]=s.nextInt();
		}
		System.out.println("Enter the index position");
		int index = s.nextInt();
		System.out.println("Enter index value : ");
		int value = s.nextInt();
		System.out.println("Array values before insert :"+Arrays.toString(a));
		
		// insert value loop
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("Array values after insert :"+Arrays.toString(a));
	}
}
