package com.ok.example.dp.behavioral.template;

import java.util.Arrays;

public interface Sorting {	
	default int[] createArray() {		
		int[] arr = {11,24,3,45,7,69,9,10,7};
		printArray(arr);
		return arr;
	}	
	default void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}	
	// abstract method -> placeholder
	int[] sort(int[] arr);
	//template method
	default void sorting() {
		int[] arr = createArray();
		sort(arr);
		printArray(arr);		
	}
}
