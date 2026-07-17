package SkillScript.p1526;

import java.util.HashSet;

public class Solution {
    public static String recoverString(String s, String k) {
        HashSet<Character> stuck = new HashSet<>();
        for (char ch: k.toCharArray()) {
            stuck.add(ch);
        }
        StringBuilder res = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (!stuck.contains(c)) {
                res.append(c);
            } else {
                if (res.isEmpty() || res.charAt(res.length() - 1) != c) {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "helllloooowoorrlddd";
        String k = "lo";
        System.out.println(recoverString(s,k));
    }
}
