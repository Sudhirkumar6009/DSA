package leetcode.p78;

import java.util.ArrayList;
import java.util.List;

public class NewSolution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int mask = 0; mask < (1 << nums.length); mask++) {
        List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            subsets.add(list);
        }
        return subsets;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
