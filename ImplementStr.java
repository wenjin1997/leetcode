package leetcode;

import java.util.Scanner;

public class ImplementStr {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String haystack = in.next();
		String needle = in.next();
		int n = needle.length();
		if(needle.equals(""))
		{
			System.out.println(0);
		}
		for(int i = 0; i < haystack.length() - n + 1; i++)
		{
			if(haystack.substring(i, i + n).equals(needle))
			{
				System.out.println(i);
			}
		}
		System.out.println(-1);
	}
}