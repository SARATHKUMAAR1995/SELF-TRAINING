package Training;

import java.util.*;
import java.util.*;

public class Binary2decimal {
	public static int binary2decimal(int bin) {
		int dec = 0, power = 0;
		while (bin != 0) {
			int remainder = bin % 10;
			dec += remainder * Math.pow(2, power);
			bin = bin / 10;
			power++;
		}
		return dec;
	}

	public static void main(String[] args) {
		System.out.print("Enter the decimal value : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n + " binary - Decimal no is " + binary2decimal(n));
	}

}
