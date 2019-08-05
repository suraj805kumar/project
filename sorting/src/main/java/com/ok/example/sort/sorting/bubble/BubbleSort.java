package com.ok.example.sort.sorting.bubble;

import com.ok.example.sort.sorting.Sort;

public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] input) {
		
		return bubbleSort(input);
	}

	private int[] bubbleSort(int[] input) {
		for(int i = 0; i< input.length ; i++) {
			for(int j = 1,k=0; j<input.length-i;j++,k++) {
				if(input[k]>input[j]) {
					swap(input, k, j);
				}
			}
		}
		return input;
	}

	private void swap(int[] input, int i, int j) {
		int temp = input[j];
		input[j]= input[i];
		input[i] = temp;		
	}
}
