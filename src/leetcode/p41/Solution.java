package leetcode.p41;

import java.util.Arrays;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        int max = 0;
        for (int n : nums) max = Math.max(max,n);
        int[] arr = new int[max];
        int i = 0;
        for (int j = 0; j < nums.length; j++) arr[j] = nums[j];
        while (i < nums.length) {
            if (arr[i] < 0) {
                i++; continue;
            }
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }

        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                return k+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,9,1};
        System.out.println(firstMissingPositive(nums));
    }
}
