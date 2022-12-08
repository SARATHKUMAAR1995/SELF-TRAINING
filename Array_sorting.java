package Training;
import java.util.*;
import java.util.Arrays;

public class Array_sorting {

	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = s.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a[" + i + "] index value :");
			a[i] = s.nextInt();
		}
		System.out.println("Before sort : "+Arrays.toString(a));
		for(int i=0;i<=n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println("After sort : "+Arrays.toString(a));

	}

}
