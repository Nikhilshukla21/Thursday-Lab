//program to find first and last digit of any number.
package basicprogram;

import java.util.Scanner;

public class FirstAndLastNumber {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number: ");
		int number = sc.nextInt();// For taking input

		int first_digit = number;
		while (first_digit > 10) {// For printing first number
			first_digit = first_digit / 10;
		}

		int last_digit = number % 10;// For printing last number

		System.out.println("First Digit of " + number + " is: " + first_digit);
		System.out.println("Last Digit of " + number + " is: " + last_digit);
	}
}
