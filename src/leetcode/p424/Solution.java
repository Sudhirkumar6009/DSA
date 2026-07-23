package leetcode.p424;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static int characterReplacement(String s, int k) {
        for (int left = 0; left < s.length(); left++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int right = left; right < s.length(); right++) {
                hashMap.put(s.charAt(right), hashMap.getOrDefault(s.charAt(right), 0)+1);
                System.out.println(hashMap);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
}
