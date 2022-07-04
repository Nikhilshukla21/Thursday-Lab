//Program to print the elements of an array in reverse order
package arrayexamples;

import java.util.Scanner;

public class ArrayInReverse {

	public static void main(String[] args) {
		int size, i;// declare variable
		Scanner sc = new Scanner(System.in);

		// receive size of an array from user
		System.out.println("Enter size of an array");
		size = sc.nextInt();

		// instantiate array
		int arr[] = new int[size];

		// getting array elements from user
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Given array is");
		// for printing given array
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Array after reverse");
		// for printing reverse of array
		for (i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
