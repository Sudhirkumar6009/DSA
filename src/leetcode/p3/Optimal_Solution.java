package leetcode.p3;

import java.util.HashSet;

public class Optimal_Solution {
    public static int lengthOfLongestSubstring (String s) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
