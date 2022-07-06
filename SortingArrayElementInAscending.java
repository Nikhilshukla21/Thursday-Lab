//write a program to sort array elements in ascending order.
package arrayexamples;

import java.util.Scanner;

public class SortingArrayElementInAscending {

	public static void main(String[] args) {
		int i, j, temp = 0, arr[], size;
		Scanner sc = new Scanner(System.in);
		// input size of array
		System.out.println("Enter size of an array");
		size = sc.nextInt();
		// instantiate array
		arr = new int[size];
		// input elements in array
		System.out.println("Enter " + size + " elements in an array");
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("After sorting elements in accending order");
		for (i = 0; i < size; i++) // i=2<5 t
		{
			for (j = i + 1; j < size; j++) // j=4<5t

			{
				if (arr[i] > arr[j]) // arr[1]>arr[4] 2>9f

				{
					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}

			}
			System.out.println(arr[i] + " ");
		}

	}

}
