package tcs;

import java.util.Arrays;
import java.util.HashMap;
public class Two_sum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (hashMap.containsKey(req)) {
                return new int[] {hashMap.get(req), i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String args[]) {
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
