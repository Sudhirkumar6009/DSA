package leetcode.p977;

import java.util.Arrays;

public class Solution {
    public static int[] sortedSquare(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,-3,10};
        System.out.println(Arrays.toString(sortedSquare(nums)));
    }
}
