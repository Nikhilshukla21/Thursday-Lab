package arrayexamples;

public class MaxAndMin2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 8, 6, 3, 2 };// array elements
		int min = arr[0];
		int max = arr[0];

		System.out.println("Given array is: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// for printing array element
			if (arr[i] < min) {// for finding minimum element
				min = arr[i];

			}
			if (arr[i] > max) {// for finding maximum element
				max = arr[i];
			}

		}
		System.out.println("Minimum element in array is: " + min);
		System.out.println("Maximum element in array is: " + max);
	}

}
