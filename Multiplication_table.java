package Training;
import java.util.*;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the table : ");
		int t = s.nextInt();
		System.out.print("Enter the limit : ");
		int l = s.nextInt();
		for(int i = 1;i<=l;i++)
		{
			System.out.println(i+" x "+t+" = "+i*t);
		}

	}

}
