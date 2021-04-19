package leetcode;

import java.util.Scanner;

// 牛顿迭代法
public class Sqrtx {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		double err = 2;
		double xn = c;
		double xn_1;
		while(err > 0.01)
        {
            xn_1 = xn / 2.0 + c / (2 * xn);
            System.out.println("xn_1:" + xn_1);
            err = Math.abs(xn_1 - xn);
            System.out.println("err: " + err);
            xn = xn_1;
        }
		System.out.println((int)xn);
	}
}