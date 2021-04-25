package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] result = new int[2];
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            if(hashtable.containsKey(target - nums[i])){
                result[0] = hashtable.get(target - nums[i]);
                result[1] = i;
            }
            hashtable.put(nums[i], i);
        }
        System.out.println(result[0] + " " + result[1]);
    }
}