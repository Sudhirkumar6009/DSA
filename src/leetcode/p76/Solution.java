package leetcode.p76;

import java.util.HashMap;

public class Solution {
    public static String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (hashMap.containsKey(s.charAt(right))) {
                left = right;
                hashMap.replace(s.charAt(right), hashMap.getOrDefault(s.charAt(right),0)-1);
            }
        }
        System.out.println(hashMap);
        return "";
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
