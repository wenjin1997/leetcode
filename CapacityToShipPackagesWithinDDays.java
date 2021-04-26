package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		int n = in.nextInt();
		int[] weights = new int[n];
		for(int i = 0; i < n; i++) {
			weights[i] = in.nextInt();
		}
		Solution s = new Solution ();
		System.out.println(s.shipWithinDays(weights, D));
	}

}

class Solution {
    public int shipWithinDays(int[] weights, int D) {
    	// 确定二分查找左右边界
    	int left = Arrays.stream(weights).max().getAsInt(), right = Arrays.stream(weights).sum();
    	while(left < right) {
    		int mid = (left + right) / 2;
    		// need 为需要运送的天数
    		// cur 为当前这一天已经运算的包裹重量之和
    		int need = 1, cur = 0;
    		for(int weight : weights) {
    			if(cur + weight > mid) {
    				++need;
    				cur = 0;
    			}
    			cur += weight;
    		}
    		if(need <= D) {
    			right = mid;
    		}
    		else {
    			left = mid + 1;
    		}
    	}
    	return left;
    }
}
