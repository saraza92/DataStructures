package datastructure_problems.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumHashmap {
	
	public static int[] twoSumHash(int[] arr, int sum) {
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		int[] results =null;
		
	    for (int idx = 0; idx < arr.length; ++idx) {
            final int difference = sum - arr[idx];
            if (hash.containsKey(arr[idx])) {
                if (results == null) {
                    results = new int[2];
                }
                results[0] = hash.get(arr[idx]);
                results[1] = idx;
            } else {
                hash.put(difference, idx);
            }
            
	    }

        return results != null ? results : new int[] { };
    }
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int sum = 9;
		int[] result = twoSumHash(arr, sum);
		if (result != null)
		System.out.println(Arrays.toString(result));
	}
}
