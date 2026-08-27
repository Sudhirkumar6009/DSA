package leetcode.p76;

import java.util.HashMap;

public class Solution {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char ch: t.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if (hashMap.containsKey(c) && window.get(c) <= hashMap.get(c)) count++;
            while (count == t.length()) {
                if (right-left+1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar)-1);
                if (hashMap.containsKey(leftChar) && window.get(leftChar) < hashMap.get(leftChar)) count--;
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
