package leetcode;

import java.util.Scanner;

public class SumofSquareNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		Solution633 s = new Solution633 ();
		System.out.println(s.judgeSquareSum(c));
		
	}
	

}

class Solution633 {
    public boolean judgeSquareSum(int c) {
    	int n = (int)Math.sqrt(c);
    	for(int i = n; i >= 0; i--) {
    		int tempt = (int)Math.sqrt(c - i * i);
    		if(tempt * tempt + i * i == c) {
    			System.out.println("i: " + i + "tempt: " + tempt);
    			return true;
    		}
    		System.out.println("i: " + i + "tempt: " + tempt);
    		
    	}
    	return false;

    }
}