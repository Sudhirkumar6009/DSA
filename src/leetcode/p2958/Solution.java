package leetcode.p2958;

import java.util.HashMap;

public class Solution {
    public static int maxSubarrayLength (int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int left = 0;
        for (int right = 0; right < nums.length ; right++) {
            int len = right - left;
            hashMap.put(nums[right], hashMap.getOrDefault(nums[right], 0)+1);
            if (returnHashMapCondition(hashMap,k)) {
                System.out.println(right-left);
            };
        }
        return 0;
    }
    public static boolean returnHashMapCondition (HashMap<Integer, Integer> hashMap, int k) {
        for (int val : hashMap.values()) {
            if (val == k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
}
