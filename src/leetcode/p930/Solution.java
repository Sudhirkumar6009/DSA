package leetcode.p930;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        List<List<Integer>> allSubArrays = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> currentSubarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    currentSubarray.add(nums[k]);
                }
                allSubArrays.add(currentSubarray);
            }
        }
        for (List<Integer> sub: allSubArrays) {
            int count = 0;
            for (Integer val: sub) {
                count+=val;
            }
            if (count == goal) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}
