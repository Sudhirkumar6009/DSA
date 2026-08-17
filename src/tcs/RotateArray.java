package tcs;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[(i+k)%nums.length];
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
