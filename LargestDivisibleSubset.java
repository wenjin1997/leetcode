package leetcode;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class LargestDivisibleSubset {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int l = 0; l < n; l++)
		{
			nums[l] = in.nextInt();
		}
		Arrays.sort(nums);
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		dp[0] = 1;
		int maxVal = nums[0], maxSize = 1;
		// 第一步 动态规划找到最大子集的个数，最大子集中的最大整数
		for(int i = 1; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(nums[i] % nums[j] == 0)
				{
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			if(dp[i] > maxSize)
			{
				maxSize = dp[i];
				maxVal = nums[i];
			}
		}
		
		//第二步 倒推得到最大子集
		List<Integer> res = new ArrayList<Integer>();
		if(maxSize == 1)
		{
			res.add(nums[0]);
			System.out.println(res);
		}
		
		for(int i = n - 1; i >= 0 && maxSize > 0; i--)
		{
			if(maxVal % nums[i] == 0 && dp[i] == maxSize)
			{
				res.add(nums[i]);
				maxVal = nums[i];
				maxSize--;
			}	
		}
		System.out.println(res);	
	}
}