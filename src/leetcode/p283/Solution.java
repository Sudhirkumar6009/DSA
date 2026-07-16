package leetcode.p283;

import java.util.Arrays;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int pos = 0;
        while (left < right) {
            if (nums[left] == 0) {
                left++;
            } else {
                int temp = nums[left];
                nums[left] = nums[pos];
                nums[pos] = temp;
                left++;
                pos++;
            }
        }
        if (right != 0) {
            int temp = nums[right];
            nums[right] = nums[pos];
            nums[pos] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {-58305,-22022,0,0,0,0,0,-76070,42820,48119,0,95708,-91393,60044,0,-34562,0,-88974};
        moveZeroes(nums);
    }
}
