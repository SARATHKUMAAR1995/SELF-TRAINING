package Training;
import java.util.*;


public class Prime_number_range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = 0;
		for(int n=1; n<=999;n++)
			{
				for(int i =1;i<=n;i++)
				{
					if(n%i ==0)
						{
							f++;
						}
				}
				if(f ==2)
				{
					System.out.println(n+" is a prime number");
				}
				f=0;
			}

	}

}
