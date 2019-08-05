package com.ok.example.sort.sorting.merge;

import com.ok.example.sort.sorting.Sort;

public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] input) {

		// apply merge sort from start index(0) to end index (length-1)
		mergeSort(input, 0, input.length - 1);

		return input;
	}

	private void mergeSort(int[] input, int start, int end) {

		if (start < end) {

			int m = (start + end) / 2;

			mergeSort(input, start, m);
			mergeSort(input, m + 1, end);
			merge(input, start, m, end);
		}

	}

	private void merge(int[] input, int start, int m, int end) {
		// find size of the two array

		int ln = m - start + 1;// since middle point(m) is part of the left array that's why length is
								// m-start+1
		int rn = end - m;// length is end-m because it will start from m+1

		// create two array
		int[] lArr = new int[ln];
		int[] rArr = new int[rn];

		// copy elements to left array
		for (int i = 0; i < ln; i++) {
			lArr[i] = input[start + i];
		}
		// copy elements to right array
		for (int j = 0; j < rn; j++) {
			rArr[j] = input[m+1+j];
		}
		// index for iterating left and right array
		int i = 0, j = 0;
		//index of merged subarray
		int k = start;
		
		// compare both array and put the smaller in the input array
		while(i < ln && j < rn) {
			if(lArr[i] <= rArr[j]) {
				input[k] = lArr[i];
				i++;
			} else {
				input[k] = rArr[j];
				j++;
			}
			k++;			
		}
		
		// if left array has element left to put in input array
		while(i<ln) {
			input[k] = lArr[i];
			i++;
			k++;
		}
		
		// if right array has elemetn left to put in input array
		while(j<rn) {
			input[k] = rArr[j];
			j++;
			k++;
		}

	}

}
