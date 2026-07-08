package leetcode.p1991;

import java.util.Arrays;

public class Solution {
    static public int findMiddleIndex(int[] nums) {
        int[] leftPrefixSum = new int[(nums.length)+1];
        leftPrefixSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            leftPrefixSum[i+1] = leftPrefixSum[i] + nums[i];
        }
        for (int j = 0; j < nums.length ; j++) {
            int left = leftPrefixSum[j];
            int right = leftPrefixSum[nums.length] - leftPrefixSum[j+1];
            if (left == right) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}
