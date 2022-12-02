package Training;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number : ");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int a = 1;
		for(int i= 1;i<=n;i++)
		{
			a = a*i;
		}
		System.out.println("Factorial of "+n+" is "+a);

	}

}
