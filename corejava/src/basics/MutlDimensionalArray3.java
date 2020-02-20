package basics;

import java.util.Scanner;

public class MutlDimensionalArray3 {

	public static void main(String[] args) {
		//Asynchronous Array with 3 Rows  
		//1st row index=0 cols=1
		//2nd row index=1 cols=2
		//3rd row index=2 cols=3
		int arr2[][] = new int[3][];

		arr2[0] = new int[1];//first row
		arr2[1] = new int[2];//second row
		arr2[3] = new int[3];//third row

		Scanner s= new Scanner(System.in);
		// Reading the elements into arr2
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = s.nextInt();
			}
		}
		System.out.println("Elements in arr2"+arr2.length);
		System.out.println("Elements in first row of arr2 "+arr2[0].length);
		
	}
}
