package leetcode.p128;

import java.util.Arrays;

public class Solution {
    public static int longestConsecutive (int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}
