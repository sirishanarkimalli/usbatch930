package basics;

import java.util.Scanner;

public class ArraySearchingNSortingTechniques {

	public boolean linearSearch(int a[], int n) {
		for (int val : a) {
			if (n == val) {
				return true;
			}
		}
		return false;
	}
	
	public void bubbleSort(int a[]) {
		int l=a.length;		
		for(int i=0;i<l;i++) {
			for(int j=0;j<l-1;j++) {
				for(int k=j+1;k<l;k++)
				if(a[j]>a[k]) {
					int c=a[j];
					a[j]=a[k];
					a[k]=c;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);

		System.out.println("Enter elements into array ");
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter the element for search : ");
		int n = s.nextInt();

		ArraySearchingNSortingTechniques obj = new ArraySearchingNSortingTechniques();
			boolean found = obj.linearSearch(a, n);

		if (found)
			System.out.println("Match Found");
		else
			System.out.println("Match  not Found");

		obj.bubbleSort(a);
		System.out.println("Elements after sort: ");
		for(int val :a)
			System.out.print(val+" ");
		}

}
