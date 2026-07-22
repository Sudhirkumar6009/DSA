package leetcode.p3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring (String s) {
        for (int i = 0; i < s.length()-1; i++) {
            HashMap<Character,Integer> hashMap = new HashMap<>();
            for (int j = i+1; j < s.length();j++) {
                if (s.charAt(j-1) != s.charAt(j)) {
                    hashMap.put(s.charAt(j-1), hashMap.getOrDefault(s.charAt(j-1),0)+1);
                } else {
                    break;
                }
                System.out.println(hashMap);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
