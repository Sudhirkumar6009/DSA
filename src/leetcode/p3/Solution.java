package leetcode.p3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring (String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (map.containsKey(c)) {
                    break;
                }

                map.put(c, 1);
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
