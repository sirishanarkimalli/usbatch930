package basics;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int a[] = { 40, 50, 32, 88, 97 };
		System.out.println("Array elemenst before sort");
		for (int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");

		Arrays.sort(a);
		
		System.out.println("\nArray elemenst after sort");
		for (int value : a)
			System.out.print(value + " ");

		
		
		
	
		
		int index = Arrays.binarySearch(a, 88);
		
		if (index < 0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at " + index);

		
		
		String names[] = { "Rahul", "John", "Rohit" };
		Arrays.sort(names);
		System.out.println("\nString array after sorting\n");
		for (String name : names)
			System.out.print(name + " ");
		System.out.println(names.length);
	}

}
