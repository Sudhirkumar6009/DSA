package leetcode.p219;

import java.util.HashMap;

public class OptimizedSolution {
    public static boolean containsNearbyDuplicates(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(nums[i])) {
                int previousIndex = hashMap.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicates(nums, k));
    }
}
