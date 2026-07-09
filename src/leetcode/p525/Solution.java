package leetcode.p525;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    static public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        int ans = 0;
        int prefixSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if (hashMap.containsKey(sum)) {
                int last = hashMap.get(sum);
                ans = Math.max(ans, i - last);
            } else {
                hashMap.put(sum, i);
            }
        }
        System.out.println(Arrays.toString(nums));
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
}
