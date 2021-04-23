package leetcode;

import java.util.Scanner;

public class MaximumSubarray3 {
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
		for(int i = 0; i < n; i++) // 在线处理的方式
		{
			thisSum += nums[i];
			System.out.println("i:" + i + "this sum:" + thisSum);
			if(thisSum > maxSum)
			{
				maxSum = thisSum;
			}
			if(thisSum < 0)
			{
				thisSum = 0;
			}
		}
		System.out.println(maxSum);
	}
}
