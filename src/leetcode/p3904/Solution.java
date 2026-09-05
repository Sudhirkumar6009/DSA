package leetcode.p3904;

public class Solution {
    public static int firstStableIndex(int[] nums, int k) {
        int[] maxArr = new int[nums.length];
        int[] minArr = new int[nums.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
            maxArr[i] = max;
        }
        for (int i = nums.length-1; i >= 0; i--) {
            min = Math.min(min,nums[i]);
            minArr[i] = min;
        }
        for (int read = 0; read < nums.length; read++) {
            if ((maxArr[read]-minArr[read]) <= k) {
                return read;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0};
        int k = 0;
        System.out.println(firstStableIndex(nums, k));
    }
}
