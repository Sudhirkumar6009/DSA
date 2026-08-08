package leetcode.p217;

import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate (int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
