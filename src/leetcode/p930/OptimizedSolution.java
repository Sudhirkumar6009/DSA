package leetcode.p930;

import java.util.ArrayList;
import java.util.List;

public class OptimizedSolution {
    static public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        List<Integer> allSubArrays = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum+=nums[j];
                allSubArrays.add(currentSum);
            }
        }
        for (Integer subs : allSubArrays) {
            if (subs == goal) {
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
