//program to find maximum and minimum element in an array
package arrayexamples;

import java.util.Scanner;

public class MaxAndMinInArray {

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

		// Initialize array
		int min = arr[0];
		int max = arr[0];
		for (i = 0; i < arr.length; i++) {

			if (arr[i] < min) {// for finding minimum element
				min = arr[i];

			}
			if (arr[i] > max) {// for finding maximum element
				max = arr[i];
			}
		}

		System.out.println("Minimum digit element is: " + min);
		System.out.println("Maximum digit element is: " + max);

	}

}
