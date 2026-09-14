package leetcode.p78;

import java.util.ArrayList;
import java.util.List;

public class NewSolution {
    public static List<List<Character>> subsets(char[] nums) {
        List<List<Character>> subsets = new ArrayList<>();
        for (int mask = 0; mask < (1 << nums.length); mask++) {
        List<Character> list = new ArrayList<>();
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
        char[] nums = {'a','b','c'};
        System.out.println(subsets(nums));
    }
}
