package leetcode.p1358;

import java.util.HashSet;

public class Solution {
    static public int numberOfStrings(String s) {
        int num = 0;
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('b');
        hashSet.add('c');
        for (int i = 0; i < s.length()-2; i++) {
            for (int j = i+3; j <= s.length(); j++) {
                HashSet<Character> temp = new HashSet<>();
                String str = s.substring(i,j);
                for (Character ch: str.toCharArray()) {
                    if (hashSet.contains(ch)){
                        temp.add(ch);
                    }
                }
                if (temp.size() == 3) {
                    num+=1;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String str = "abcabcabc";
        System.out.println(numberOfStrings(str));
    }
}
