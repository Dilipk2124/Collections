package org.collection;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 5, 7, 9, 2, 8, 6, 5, 4, 7, 5, 9 };
		System.out.println(Arrays.toString(sortArray(ar)));
		
	}

	public static int[] sortArray(int[] ar) {
		int[] br = new int[ar.length];
		br[0] = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < br.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			br[i] = ar[i];
		}

		return br;
	}

}
