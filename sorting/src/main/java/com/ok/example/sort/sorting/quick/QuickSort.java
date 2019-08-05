package com.ok.example.sort.sorting.quick;

import com.ok.example.sort.sorting.Sort;

/**
 * Apply divide and conquer rule to sort the input
 * 
 * Take one element as pivot and place it at the exact position as after the
 * sorting. 
 * The Left hand side element will be smaller than the pivot and right
 * hand side elements will be greater than the pivot.
 * Now apply same logic to left hand side and right hand side list.
 * This will be done until the start of the list is less than end of the list.
 *
 */
public class QuickSort implements Sort {

	@Override
	public int[] sort(int[] input) {

		return quickSort(input, 0, input.length - 1);

	}

	private int[] quickSort(int[] input, int start, int end) {

		// if start is less than end than only input has to sort.Otherwise sorting of the list is done.
		if (start < end) {
			// get the correct index of the pivot element 
			int pivotExactIndex = partition(input, start, end);
			// sort the left hand side list
			quickSort(input, start, pivotExactIndex - 1);
			// sort the right hand side list
			quickSort(input, pivotExactIndex + 1, end);
		}

		//return the sorted list
		return input;

	}

	private int partition(int[] input, int start, int end) {

		// taking last element as the pivot
		int pivot = input[end];
		// index which will be used for swapping with smaller element
		int i = start - 1;
		//int i = start;
		// iterating the list
		for (int j = start; j < end; j++) {
			// if the current index is less than and equal to pivot
			if (input[j] <= pivot) {
				// incrementing the swapping index
				// because till this all element is less than the pivot 
				// so incrementing it and then swapping with next small element
				// till here swapping index all element will less than pivot
				++i;
				// swap the small element
				swap(input, i, j);
				//++i;
			}
		}
		// when iteration reach to (pivot-1) then swapping the pivot with (swapping index + 1)
		// pivot will be at the swapping index and before that all element will be less than pivot
		// and after that all element will be greater than pivot
		swap(input, ++i, end);

		// return the pivot index
		return i;
	}

	private void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

}
