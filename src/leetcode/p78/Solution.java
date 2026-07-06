package leetcode.p78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public void allSubsets(int[] nums, List<Integer> ans, int i,List<List<Integer>> all) {
        if (i == nums.length) {
            all.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        allSubsets(nums,ans,i+1,all);
        ans.removeLast();
        allSubsets(nums,ans,i+1,all);
    }
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        allSubsets(nums,ans,0,all);
        return all;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
