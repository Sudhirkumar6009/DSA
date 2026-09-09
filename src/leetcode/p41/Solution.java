package leetcode.p41;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) nums[i] = 0;
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] < 1 || nums[j] > nums.length) {
                j++;
                continue;
            }
            int correctIdx = nums[j] - 1;
            if (nums[j] != nums[correctIdx]) {
                int temp = nums[j];
                nums[j] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                j++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k+1) {
                return k+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
}
