package datastructure_problems.Arrays;

import java.util.Arrays;

public class twoSum {
	
	// Given an array of integers, return the indices of the two numbers in it that add up to a specific goal number.
	//this solution solves the problem in O(n^2). Can this be resolved in O(n)?
	public static int[] twoSumFunc(int[] arr, int goal) {
        for ( int i=0;i<arr.length;i++){
            for ( int j=i; j<arr.length;j++){
                if (arr[i]+arr[j]==goal)
                    return new int[]{i,j};
            }
        }
		
		return new int[] {};
	}
	
    public static void main(String[] args) {
        System.out.println( Arrays.toString(twoSumFunc(new int[] {1,2,3,4,5}, 9)));
    }
	
	
}
