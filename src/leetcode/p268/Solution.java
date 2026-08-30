package leetcode.p268;

public class Solution {
    public static int missingNumber(int[] nums) {
        int[] ans = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) ans[i] = nums[i];
        int i = 0;
        while (i < ans.length) {
            int actualIdx = ans[i];
            if (ans[i] != ans[actualIdx]) {
                int temp = ans[i];
                ans[i] = ans[actualIdx];
                ans[actualIdx] = temp;
            } else {i++;}
        }
        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != j) return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
