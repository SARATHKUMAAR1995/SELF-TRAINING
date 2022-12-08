// To find the duplicate values
package Training;
import java.util.Arrays;

public class Array_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,4,5,6,6,7,8,1};
		System.out.println("Duplicate values are : ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&& (i!=j))
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
