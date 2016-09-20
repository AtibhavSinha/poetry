package com.atibhav.poetry.arrays;

public class NumberComingOnlyOnce {

	static int arr[] = {7,7,3,7};
	
	static int[] countSetBit = new int[4];
	
	public static void main(String[] args) {
		int kthBit = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < countSetBit.length; j++) {
				kthBit = 1<<j;
				if((arr[i] & kthBit) == kthBit)
				{
					countSetBit[j]++;
				}
			}
		}
		for (int i = 0; i < countSetBit.length; i++) {
			System.out.print(countSetBit[i] + " ");
		}
		int result = 0;
		for (int i = 0; i < countSetBit.length; i++) {
			if(countSetBit[i]%3 == 1){
				result = result | 1 << i;
			}
		}
		System.out.println("Result ="+result);
	}
}
