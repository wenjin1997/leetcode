package leetcode;

import java.util.Scanner;

public class MaximumSubarray2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int l = 0; l < n; l++)
		{
			nums[l] = in.nextInt();
		}
		
		int thisSum = 0, maxSum = nums[0];
		for(int i = 0; i < n; i++) // 子列的左端
		{
			thisSum = 0;
			for(int j = i; j < n; j++) // 子列的右端
			{
				thisSum += nums[j];
				if(thisSum >= maxSum)
				{
					maxSum = thisSum;
				}
			}
		}
		System.out.println(maxSum);
	}
}
