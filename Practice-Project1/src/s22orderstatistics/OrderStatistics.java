package s22orderstatistics;

class main {
	
	int OrderStatistics(int arr[], int a, int b, int c) { 
		if (c > 0 && c <= b - a + 1) 
    	{ 
		 int pos = randomPartition(arr, a, b); 
         if (pos-a == c-1) 
        	 return arr[pos]; 
         if (pos-a > c-1) 
        	 return OrderStatistics(arr, a, pos-1, c); 
         return OrderStatistics(arr, pos+1, b, c-pos+a-1); 
    	} 
    return Integer.MAX_VALUE; 
} 
	void swap(int arr[], int i, int j) {
		
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	} 
	int partition(int arr[], int a, int b) { 
    
		int x = arr[b], i = a; 
		for (int j = a; j <= b - 1; j++) 
		{ 
        if (arr[j] <= x) 
        { 
            swap(arr, i, j); 
            i++; 
        } 
    } 
    swap(arr, i, b); 
    return i; 
} 
	int randomPartition(int arr[], int a, int b) { 
    
		int n = b-a+1; 
		int pivot = (int)(Math.random()) * (n-1); 
		swap(arr, a + pivot, b); 
		return partition(arr, a, b); 
	} 
}  
	public class OrderStatistics {
		public static void main(String[] args) {
		OrderStatistics ob = new OrderStatistics(); 
		int arr[] = {7, 9, 18, 12, 3, 21, 35}; 
		int n = arr.length,c = 4; 
		System.out.println("OrderStatistics  element is "+ ob.OrderStatistics(arr, 0, n-1, c)); 
	}

		private String OrderStatistics(int[] arr, int i, int j, int c) {
			// TODO Auto-generated method stub
			return null;
		}
}