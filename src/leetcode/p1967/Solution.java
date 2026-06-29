package leetcode.p1967;

import java.util.HashSet;

public class Solution {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        HashSet<String> str = new HashSet<>();
        for (int i = 0; i <= word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                String sub = word.substring(i,j);
                str.add(sub);
            }
        }
        for (String p: patterns) {
            for (String s: str) {
                if (s.equals(p)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        System.out.println(numOfStrings(patterns,"aaaaabbbbb"));

    }
}
