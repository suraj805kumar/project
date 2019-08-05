package com.ok.example.dp.behavioral.template;

public class BubbleSorting implements Sorting {
	@Override
	public int[] sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j = 1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}		
		return arr;
	}	
	@Override
	public int[] createArray() {		
		int[] arr = {11,24,3,45,7,69};
		printArray(arr);
		return arr;
	}	
	public static void main(String[] args) {
		BubbleSorting bs = new BubbleSorting();
		bs.sorting();
	}
}
