package com.jerrycook.merge;

public class MergeSort {

	private int[] numbers;
	private int[] helper;
	private int number;
	
	public int[] sort(int[] array) {
		this.numbers = array;
		this.number = array.length;
		this.helper = new int[number];
		
		mergeSort(0, number -1);
		return numbers;
	}
	
	private void mergeSort(int low, int high) {
		
		if(low < high) {
			
			int middle = low+(high - low)/2;
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			merge(low, middle,high);
		}
		
	}
	
	private void merge(int low, int middle, int high) {
		
		
		//copy to temp array
		for(int i = low; i <= high;i++) {
			helper[i] = numbers[i];
		}
		
		int i = low;
		int j = middle+1;
		int k= low;
		
		//copy smallest back to original
		
		while(i <= middle && j <= high) {
			if(helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			}else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//finish out left
		
		while(i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
	
	
}
