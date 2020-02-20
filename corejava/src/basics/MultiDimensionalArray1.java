package basics;

import java.util.Scanner;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements into arr");
		// Reading values into arr
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		// Displaying values of array arr
		System.out.println("Printing elements of arr");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elements in arr" + arr.length);
		System.out.println("Elements in first row of arr " + arr[0].length);
	}

}
