package leetcode.p2996;

import java.util.HashSet;

public class Solution {
    public static int missingInteger(int[] nums) {
        int prefixSum = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] == nums[i-1]+1) {
                prefixSum+=nums[i];
            } else {
                break;
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(nums[0]);
        for (int num : nums) {
            hashSet.add(num);
        }
        int ans = prefixSum;
        while (hashSet.contains(ans)) {
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,12,14,13}; // 1,2,2,3,5 -> [1,3,6,11]
//        3,4,5,1,12,13,14 -> 1,3,4,5,12,13,14 -> [1,4,8,13,25,38,52]
        System.out.println(missingInteger(nums));
    }
}
