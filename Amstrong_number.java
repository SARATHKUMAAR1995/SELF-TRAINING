package Training;

import java.util.*;

public class Amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an number :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = num;
		int digit1,digit2,digit3,result;
		
		digit3 = temp%10;
		temp = temp/10;
		
		digit2 = temp%10;
		temp= temp/10;
		
		digit1 = temp%10;
		result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		if(num == result)
		{
			System.out.println(result+" is an amstrong number");
		}
		else
		{
			System.out.println(num+" is not an amstrong number");
		}

	}

}
