//wap to find sum of all array elemets
package arrayexamples;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int size, i, sum = 0;// declaring variable

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array");
		size = sc.nextInt();// getting size of array element

		// instantiate array
		int arr[] = new int[size];

		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();// getting array elements from user
			sum = sum + arr[i];// for printing sum of given array
		}
		System.out.print("Sum of given array is: " + sum);

	}

}
