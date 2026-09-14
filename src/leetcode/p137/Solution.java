package leetcode.p137;

public class Solution {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int n : nums) {
                count += (n >> i) & 1;
            }
            if (count % 3 != 0) {
                res |= (1 << i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}
