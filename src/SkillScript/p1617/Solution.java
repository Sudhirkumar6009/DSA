package SkillScript.p1617;

import java.util.Arrays;

public class Solution {
    public static void solve(int[] nums){
        int[] dummy = Arrays.copyOf(nums, nums.length);
        Arrays.fill(nums,0);
        int idx = 0;
        for (Integer val: dummy){
            if (val == 0) continue;
            nums[idx] = val;
            idx = idx + 1;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};
        solve(num);
    }
}
