package leetcode.p442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {i++;}
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1}; //  [0,2,3,4,0,0,7,8]
        System.out.println(findDuplicates(nums));
    }
}
