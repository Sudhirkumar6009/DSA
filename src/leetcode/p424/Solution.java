package leetcode.p424;

import java.util.HashMap;

public class Solution {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int ans = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq, hashMap.get(c));

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                hashMap.put(leftChar, hashMap.get(leftChar) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            System.out.println(hashMap);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
}
