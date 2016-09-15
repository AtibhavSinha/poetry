package com.atibhav.poetry.arrays;

public class MissingNumberInArray {

	static int arr1[] = {1,2,3,4};
	static int arr2[] = {4,2,3};
	
	public static void main(String[] args) {
		int result = arr1[0];
		
		for (int i = 1; i < arr1.length; i++) {
			result = result^arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			result = result^arr2[i];
		}
		
		System.out.println(result);
		// other way: Sum and difference
	}
}
