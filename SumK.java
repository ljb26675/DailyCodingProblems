import java.util.HashMap;
import java.util.Map;


/** Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *  For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *  Bonus: Can you do this in one pass?
 */
public class SumK {


	/* with a loop (brute force way)*/
	public static boolean sumK(int[] arr, int k){
		
		if(arr.length != 0 && arr != null){ //check not empty or null
			for(int i=0; i<arr.length-1; i++){
				for(int j=i+1; j<arr.length; j++){
				
					if(arr[i]+arr[j] == k) return true;
					
				}
			}
		}
		
		return false;
	}
	
	/* Bonus: with one pass */
	public static boolean hashSumK(int[] arr, int k) {
		if(arr.length != 0 && arr != null){ //check not empty or null
			Map<Integer, Integer> list = new HashMap<>();

			for (int i = 0; i < arr.length; i++) {
				
				int curr = arr[i];
				
				//check to see if k - curr is in list yet
				if(list.containsKey(k - curr)){
					return true;
				}
				
				//if not add it to list
				list.put(curr, i);
				
			}
		}
		return false;
	}
 
	public static void main(String[] args){
		
		int[] arr = {10, 15, 3, 7};
		int k = 17;
		
		System.out.println(sumK(arr, k));
		
		System.out.println(hashSumK(arr, k));
		
	}
 
 
}
 