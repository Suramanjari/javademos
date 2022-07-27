package s30searchalgorithm;

import java.util.Arrays;

public class s33ExponentialSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		int length = arr.length;
		int value = 5;
		int outcome = exponentialSearch(arr,length,value);
		
		if(outcome < 0) {
			System.out.println("Element is not in array");
		}
		else {
			System.out.println("Element present in the array at index:" + outcome);
		}
	}
	
	public static int exponentialSearch(int[] arr, int length, int value) {
	
	if(arr[0] == value) {
		return value;
	}
	int i =1;
	while(i < length && arr[i] <= value) {
		return i;
	}
	return Arrays.binarySearch(arr, i/2, Math.min(i, length), value);
	}
}
