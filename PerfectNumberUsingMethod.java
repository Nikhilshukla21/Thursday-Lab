//Write a program to check given number is perfect or not.

package basicprogram;

import java.util.Scanner;

public class PerfectNumberUsingMethod {
	public static boolean perfectNumberUsingMethod(int n) {
		int i, sum = 0;
		// Looping Number
		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
				// sum+=i;
			}
		}
		if (n == sum)
			return true;
		else
			return false;
		// Ternary operator
		// boolean b=(n==sum)?true:false;
		// return b;
	}

	public static void main(String[] args) {
		int num;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect or not");
		num = sc.nextInt();// Taking user input
		result = PerfectNumberUsingMethod.perfectNumberUsingMethod(num);
		System.out.println(result);// Printing result

	}

}
