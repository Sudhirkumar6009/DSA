package leetcode.p645;

import java.util.Arrays;

public class Solution {
    public static int[] findErrorNums (int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans[0] = nums[j];
                ans[1] = j + 1;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
