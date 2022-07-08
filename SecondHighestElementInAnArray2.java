package arrayexamples;

import java.util.Scanner;

public class SecondHighestElementInAnArray2 {

	public static void main(String[] args) {
		// Declare variable
		int size, i, j, temp;
		Scanner sc = new Scanner(System.in);

		// receive size of an array from user
		System.out.println("Enter size of an array");
		size = sc.nextInt();

		// inistantiate array
		int arr[] = new int[size];

		// getting array elements from user
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Sorting array in assending order
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// printing result
		System.out.println("The second highest element in an array is:: " + arr[arr.length - 2]);

	}

}
