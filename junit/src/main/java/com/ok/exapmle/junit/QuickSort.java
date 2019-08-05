package com.ok.exapmle.junit;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class QuickSort {

	public int[] sort(int[] input) {
		return quickSort(input, 0, input.length - 1);
	}

	private int[] quickSort(int[] input, int low, int high) {

		if (low < high) {

			int pivIdx = partition(input, low, high);

			quickSort(input, low, pivIdx - 1);
			quickSort(input, pivIdx + 1, high);
		}

		return input;
	}

	private int partition(int[] input, int low, int high) {

		int pivot = input[high];
		int i = low;
		for (int j = low; j < high; j++) {
			if (input[j] < pivot) {
				swap(input, i, j);
				i++;
			}
		}

		swap(input, i, high);

		return i;
	}

	private void swap(int[] input, int i, int j) {

		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}
	
	public String printArray(int[] input) {
		return (Arrays.toString(input));
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		System.out.println(qs.printArray(qs.sort(new int[]{23,44,55,1,67,78,34,65,88,47})));
	}

}
