//Write a program to check given number is Armstrong or not.
package basicprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Declaring variable
		int num, number, temp, sum = 0;
		System.out.println("Enter three number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // Taking user input

		number = num;// declare for future use

		while (number > 0) {// to caluclate the arstrong number
			temp = number % 10;
			number /= 10;
			sum = sum + temp * temp * temp;
		}
		// checking Sum and actual number is equal or not
		if (sum == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}
}
