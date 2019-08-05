package com.ok.example.sort.sorting.insertion;

import com.ok.example.sort.sorting.Sort;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] input) {
		
		return insertionSort(input);
	}

	private int[] insertionSort(int[] input) {

		int n = input.length;
		
		for(int j=1;j<n;j++) {
			int key = input[j];
			int i=j-1;
			while(i>-1 && input[i]>key) {
				input[i+1] = input[i];
				i--;				
			}
			input[i+1]=key;
		}		
		return input;
	}

}
