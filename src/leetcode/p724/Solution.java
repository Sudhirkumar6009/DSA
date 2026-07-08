package leetcode.p724;

import java.util.Arrays;

public class Solution {
    static public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length+1];
        prefixSum[0] = 0;
        prefixSum[1] = nums[0];
        for (int i = 2; i < nums.length+1; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        for (int j = 0; j < nums.length; j++) {
            int left = prefixSum[j];
            int right = prefixSum[nums.length] - prefixSum[j+1];
            if (left == right) {
                return j;
            }
        }
        System.out.println(Arrays.toString(prefixSum));
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
