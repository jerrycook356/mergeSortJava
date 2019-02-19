package com.jerrycook.merge;


public class MainClass {

	
	public static void main(String[] args) {
		
		int array[] = {1,10,23,25,30,2};
		
		MergeSort ms = new MergeSort();
		array = ms.sort(array);
		printArray(array);
		
	

	}
	
	public static void printArray(int[] array)
	{
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println("\n\n");
	}

}
