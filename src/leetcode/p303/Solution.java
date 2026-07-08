package leetcode.p303;


import java.util.Arrays;

class NumArray {
    int range = 0;
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    public int sumRange(int left, int right) {
        range = right - left + 1;
        int[] prefixSum = new int[range];
        prefixSum[0] = nums[left];
        for (int i = 1; i < range; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[left + i];
        }
        return prefixSum[prefixSum.length-1];
    }
}
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println((numArray.sumRange(0,2)));
        System.out.println((numArray.sumRange(0,5)));
        System.out.println((numArray.sumRange(2,5)));
    }
}
