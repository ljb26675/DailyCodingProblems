import java.util.Arrays;


/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all
 * the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was 
 * [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 */

public class ProductI{
	
	/* Getting products above and below the current index */
	public static int[] products(int[] arr){
		
		int n = arr.length;
		int[] newArr = new int[n];
		int p;
		
		// Products above current index.
		p=1;
		for(int i=0;i<n;i++) {
		  newArr[i]=p;
		  p*=arr[i];
		}

		// Products below current index.
		p=1;
		for(int i=n-1;i>=0;i--) {
		  newArr[i]*=p;
		  p*=arr[i];
		}
		
		return newArr;
		
		
	}
	
	
	
	
	
	public static void main(String[] args){
		
		int[] array = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(array)); // [ 1, 2, 3, 4, 5 ]
		array = products(array);
		System.out.println(Arrays.toString(array)); // [ 120, 60, 40, 30, 24 ]
		
	}
	
	
}