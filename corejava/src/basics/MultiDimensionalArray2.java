package basics;

public class MultiDimensionalArray2 {

	public static void main(String[] args) {
		//Matrix array with 2 rows and 3 cols
		//1	 2	3
		//4	 5	6
		int arr1[][]= { {1,2,3}, {4,5,6} };		
		
		System.out.println("Printing elements of arr1");
		//Displaying values of array arr1
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Elements in arr1"+arr1.length);
		System.out.println("Elements in first row of arr1 "+arr1[0].length);
		
	}
}
