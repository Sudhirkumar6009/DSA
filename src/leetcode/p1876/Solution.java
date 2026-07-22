package leetcode.p1876;

import java.util.*;

public class Solution {
    public static int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int k = 3;
        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

        if (map.size() == 3) count++;

        for (int i = k; i < s.length(); i++) {
            char left = s.charAt(i - k);
            map.put(left, map.get(left)-1);
            if (map.get(left) == 0) {
                map.remove(left);
            }

            char right = s.charAt(i);
            map.put(right, map.getOrDefault(right, 0) + 1);

            System.out.println(map);
            if (map.size() == 3) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(countGoodSubstrings(s));
    }
}
