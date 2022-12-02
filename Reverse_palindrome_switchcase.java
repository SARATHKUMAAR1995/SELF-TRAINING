package Training;

import java.util.*;

public class Reverse_palindrome_choice {

	public static void main(String[] args) {
		int ch = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice :\n"
				+ "1.Reverse number\n"
				+ "2.Palindrome number\n"
				+ "3.Reverse & Palindrome number");
		ch = s.nextInt();
		if(ch<=3 && ch>=1){
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int a = n;
		int reverse = 0,remainder;
		while(n !=0)
		{
			remainder = n%10;
			reverse = (reverse*10)+remainder;
			n=n/10;
		}
		switch (ch)
		{
		case 1:
			System.out.println("Reversed number  :"+reverse);
			break;
		case 2:
			if(reverse == a)
			{
				System.out.println("palindrome number: "+reverse);
				break;
			}
			else
			{
				System.out.println(reverse+" is  not a palindrome number");
				break;
			}
		case 3:
			if(reverse == a)
			{
				System.out.println("Reversed number  :"+reverse);
				System.out.println("palindrome number: "+reverse);
				break;
			}
			else
			{
				System.out.println("Reversed number  :"+reverse);
				System.out.println(reverse+" is  not a palindrome number");
				break;
			}
		default:
		{
			System.out.println("Invalid choice");
		}
		}

	}else
	{
		System.out.println("Invalid choice");
	}

}}
