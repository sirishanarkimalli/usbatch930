package basics;

import java.util.Scanner;

public class ArrayCreationDemo {

	public static void main(String[] args) {

//		int arr[] = new int[5];
		int[] arr=new int[5];
		int[] arr1= {32,3,55,6,1};
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 5 elements into the array:");
		double sum = 0, sum1=0, avg = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
			sum += arr[i];// sum=sum+arr[i];
			sum1+=arr1[i];
		}

		avg = sum / 5;
		System.out.println("Sum of the given array elements: " + sum);
		System.out.println("Sum of the given array elements: " + sum1);
		System.out.println("Average of the given array elements: " + avg);
		

	}

}
