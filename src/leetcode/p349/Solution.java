package leetcode.p349;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int[] intersection (int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for (int num : nums1) {
            hashSet.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashSet.contains(nums2[i])) list.add(nums2[i]);
        }
        int[] arr = new int[list.size()];
        int i = 0;
        for (int num : list) {
            arr[i++] = num;
        }
        return new int[10];
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
