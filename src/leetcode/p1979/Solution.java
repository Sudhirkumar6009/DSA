package leetcode.p1979;

import java.util.HashSet;

public class Solution {
        public static int findGCD(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
            int res = Integer.MAX_VALUE;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]%i == 0) {
                    hashSet.add(i);
                }
            }
            for (int num: hashSet) {
                System.out.println(num);
            }
            return res;
        }

    public static void main(String[] args) {
        System.out.println(findGCD(new int[] {7,5,6,8,3}));
    }

}
