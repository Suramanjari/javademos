package usingarrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {9,71,23,39,11};
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int element : a ) {
			sum2 += element;
		}
		System.out.println(sum2);
		
		
		}
	}

}
