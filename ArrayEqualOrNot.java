//wap to check two array are equals or not.
package arrayexamples;

import java.util.Scanner;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		int size, i;// Declare variable
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		size = sc.nextInt();

		// instantiate array
		int arr1[] = new int[size];
		int arr2[] = new int[arr1.length];

		System.out.println("Enter " + size + " elements in first array");
		for (i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();// for taking size

		}

		System.out.println("Enter " + size + " elements in second array");
		for (i = 0; i < arr1.length; i++) {
			arr2[i] = sc.nextInt();

		}
		for (i = 0; i < arr1.length; i = i + 1) {

			// To check if any element is different
			if (arr1[i] != arr2[i]) {
				// If any element is different then it
				// will assign false into boolean
				result = false;
			} else {

				// If the length of two arrays is different then
				// it will assign false into boolean variable
				result = true;
			}
		}

		if (result == true) {

			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}

}
