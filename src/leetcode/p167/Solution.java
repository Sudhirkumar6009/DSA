package leetcode.p167;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                res[0] = left+1;
                res[1] = right+1;
                left=right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
