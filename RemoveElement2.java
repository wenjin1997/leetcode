package leetcode;

import java.util.Scanner;

// 27.移除元素 双指针法
public class RemoveElement2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		int n = in.nextInt();
		int left = 0;
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		for(int right = 0; right < n; right++)
		{
			if(nums[right] != val)
			{
				nums[left] = nums[right];
				left++;
			}
		}
		
		System.out.println(left);
		for(int i = 0; i < n; i++)
		{
			System.out.print(nums[i]);
		}
	}
}
