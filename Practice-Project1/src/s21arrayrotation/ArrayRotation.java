package s21arrayrotation;

public class ArrayRotation {
	
	public void rotate(int[] n, int k) {
		if(k > n.length) 
   			k=k%n.length;
		int[] result = new int[n.length];
		for(int i=0; i < k; i++){
    			result[i] = n[n.length-k+i];
		}
		int j=0;
		for(int i=k; i<n.length; i++){
    			result[i] = n[j];
    			j++;
		}
		System.arraycopy( result, 0, n, 0, n.length );
	}

	public static void main(String[] args) {
	ArrayRotation r = new ArrayRotation();
    		int arr[] = { 1,3,5,7,9,11,13,15,17 }; 
    		r.rotate(arr, 5); 
    		for(int i=0;i<arr.length;i++){
        			System.out.print(arr[i]+" ");
    		}
}
}