package usingarrays;

public class UsingArrays {
	
public static void main(String[] args) {
		
		int arr1[];
		
		int[] arr2 = {10,30,50,70,90};
		
		int[] arr3 = new int[5];
		
		arr3[0] = 2;
		arr3[1] = 4;
		arr3[2] = 6;
		arr3[3] = 8;
		
		System.out.println("Print the elements of the array: ");
		System.out.println("Lenght of array:  " + arr3.length);
		
		for (int i=0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}		
		System.out.println("-----");
		for (int element: arr3) {
			System.out.println(element);
		}
	}

}