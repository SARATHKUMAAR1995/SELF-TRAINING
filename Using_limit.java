// to sum and average using limit
package Training;
import java.util.*;

public class Using_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Emter the limit: ");
		int n =s.nextInt();
		int sum = 0,a;
		for(int i = 1;i<=n;i++)
		{
			System.out.print("Enter the number"+i+": ");
			a= s.nextInt();
			sum +=a;
		}
		System.out.println("The sum of given number is : "+ sum);
		System.out.println("The average of given number is : "+sum/n);

	}

}
