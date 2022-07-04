//wap to add two array and store it in third array.
package arrayexamples;

import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		int i, size1, size2;// Declare variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array:");
		size1 = sc.nextInt();
		System.out.println("Enter size of Second array:");
		size2 = sc.nextInt();

		if (size1 != size2) {// To check if any element is different
			System.out.println("Both array must have same number of elements!");
			return;
		}

		// instansiate array
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		int arr3[] = new int[size1];

		System.out.println("Enter " + size1 + " element in first array:");
		for (i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();// for taking element of first array
		}
		System.out.println("Enter " + size2 + " element in second array:");
		for (i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();// for taking element of second array

		}
		// for printing third array
		System.out.println("Resultant third array is:");
		for (i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
			System.out.println(arr3[i]);
		}

	}

}
