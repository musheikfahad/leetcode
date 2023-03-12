package com.easy;

public class TwoSum1 {

	private static int[] nums = {1,2,};

	public static int[] twoSum(int[] nums, int target) {
		// 3
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				int x = target - nums[i];

				if (nums[j] == x) {
					return new int[]  { i, j };
					
					
					
				}
				
				
			}
			
		}
	throw new IllegalArgumentException("no match found");

	}

	public static void main(String[] args) {
		
		twoSum(nums , 5);
	
		
	}
	}


