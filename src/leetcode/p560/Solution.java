package leetcode.p560;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    static public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int result = 0;
        int prefixSum = 0;
        for (int num: nums) {
            prefixSum += num;
            if (hashMap.containsKey(prefixSum - k)) {
                result += hashMap.get(prefixSum - k);
            }
            hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,k));
    }
}
