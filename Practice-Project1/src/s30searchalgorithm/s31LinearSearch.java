package s30searchalgorithm;

import java.util.Scanner;

public class s31LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10};
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an element to search");
			int searchValue = sc.nextInt();
			int result = (int)linearing(arr,searchValue);
			
			if(result == -1) {
				System.out.println("Elements not in array");
			}
			else {
				System.out.println("Element found at " + result + "\nSearch key is " + arr[result]);
			}
		}
		
	}
	
	public static int linearing(int arr[], int x) {
		int arrlength = arr.length;
		for(int i = 0;i<arrlength-1; i++) {
			if(arr[i] == x) {
				return i;
			}	
		}		
		return -1;
	}
}