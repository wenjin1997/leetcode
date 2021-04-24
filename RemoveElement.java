package leetcode;

import java.util.Scanner;

// 27.移除元素
public class RemoveElement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		int n = in.nextInt();
		int count = 0;
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(nums[i] == val)
			{
				count = count + 1;
				nums[i] = -1;
			}
		}
		
		for(int i = 0; i < n - count; i++)
		{
			if(nums[i] < 0)
			{
				for(int j = n - 1; j >= n - count; j--)
				{
					if(nums[j] >= 0)
					{
						nums[i] = nums[j];
						nums[j] = -1;
						break;
					}
				}
			}
		}
		System.out.println(count);
		for(int i = 0; i < n; i++)
		{
			System.out.print(nums[i]);
		}
	}
}
