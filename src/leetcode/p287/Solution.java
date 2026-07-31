package leetcode.p287;

import java.util.Arrays;

public class Solution {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
}
