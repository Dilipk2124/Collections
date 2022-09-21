package org.collection;

public class ArrayListSort {
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 5, 7, 6, 7, 9, 4, 9 };
		System.out.println("Before sorting :");
		for (int n : a) {
			System.out.print(n);

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("\nAfter Sorting :");
		for (int x : a) {
			System.out.print(x);

		}
	}

}
