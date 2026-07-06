package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int count = 4;
            List<Integer> sub_list = new ArrayList<>();
            for (int j = 1; j  <= nums.length-1; j++) {
            }
            System.out.println(sub_list);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
