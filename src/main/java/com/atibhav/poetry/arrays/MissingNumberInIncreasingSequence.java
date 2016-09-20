package com.atibhav.poetry.arrays;

public class MissingNumberInIncreasingSequence {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		System.out.println("Missing Number"+ missingNumberInIncreasingSequence(arr));
	}
	
	public static int missingNumberInIncreasingSequence(int[] arr){
		int lo =0, hi = arr.length-1;
		int mid, missingNumber=-1;
		while(lo<=hi){
			mid = (lo+hi)/2;
			if(lo == hi){
				missingNumber = arr[mid]-1;
				break;
			}
			else if(arr[mid]-1 == mid){				
				lo = mid+1;
			}
			else{
				hi = mid;
			}
		}			
		return missingNumber;
	}

}

