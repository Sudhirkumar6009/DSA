package leetcode.p239;

import java.util.Arrays;

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        for (int i = 0; i < nums.length - k + 1; i++) {
                int max = Integer.MIN_VALUE;
            for (int j = i; j < k + i; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,-1};
        int k = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
