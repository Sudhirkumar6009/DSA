package leetcode.p3731;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<Integer> findMissingElements (int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            hashSet.add(n);
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        for (int i = min; i < max; i++) {
            if (!hashSet.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {7,8,6,9};
        System.out.println(findMissingElements(nums));
    }
}
