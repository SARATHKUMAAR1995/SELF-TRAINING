package Training;
import java.util.*;


public class Prime_number {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int f =0;
		for(int i =1;i<=n;i++)
		{
			if(n%i ==0)
			{
				f++;
			}
		}
		if (f == 2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}

	}

}
