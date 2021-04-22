package leetcode;

import java.util.Scanner;

public class MaximumSubarray1 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int l = 0; l < n; l++)
		{
			nums[l] = in.nextInt();
		}
		
		int thisSum = 0, maxSum = 0;
		for(int i = 0; i < n; i++) // 子列的左端
		{
			for(int j = i; j < n; j++) // 子列的右端
			{
				for(int k = i; k <= j; k++)
				{
					thisSum += nums[k];
				}
				if(thisSum >= maxSum)
				{
					maxSum = thisSum;
				}
				thisSum = 0;
			}
		}
		System.out.println(maxSum);
	}
}
