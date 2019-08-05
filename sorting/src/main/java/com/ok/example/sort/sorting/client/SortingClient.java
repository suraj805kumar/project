package com.ok.example.sort.sorting.client;

import java.util.Arrays;
import java.util.List;

import com.ok.example.sort.sorting.Sort;
import com.ok.example.sort.sorting.bubble.BubbleSort;
import com.ok.example.sort.sorting.insertion.InsertionSort;
import com.ok.example.sort.sorting.merge.MergeSort;
import com.ok.example.sort.sorting.quick.QuickSort;

public class SortingClient {

	public static void main(String[] args) {

		// Creating List by array
		// List<Integer> list = Arrays.asList(23, 45, 12, 23, 34, 56, 67, 88, 9, 12,
		// 24);
		
		// converting list to Array
		// Integer[] input = new Integer[list.size()];
		// input = list.toArray(input);

		int[] input = { 23, 45, 12, 23, 34, 56, 67, 88, 9, 12, 24 };

		
		// printArray(input);
		// sort.sort(input);
		// printArray(input);

		// input = { 23, 45, 12, 23, 34, 56, 67, 88, 9, 12, 24 };

		// Quick Sort
		// Sort sort = new QuickSort();
		// Merge Sort
		// Sort sort = new MergeSort();
		// Insertion Sort
		Sort sort = new InsertionSort();
		//Sort sort = new BubbleSort();
		printArray(input);
		sort.sort(input);
		printArray(input);

	}

	private static void printArray(int[] input) {
		 // not working -> System.out.println(" " + Arrays.asList(input));

		System.out.println(Arrays.toString(input));

		// for (int i : input) {
		// System.out.print(i + " ");
		// }
		// System.out.println();

	}

}
