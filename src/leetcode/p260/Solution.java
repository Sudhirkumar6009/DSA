package leetcode.p260;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int[] singleNumber (int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int n : nums) {
                count += (n >> i) & 1;
                hashSet.add(count);
            }
            if (count % 3 != 0) {
                res |= (1 << i);
                System.out.println(res);
            }
        }
        System.out.println(res);
        System.out.println(hashSet);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5} ;
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
