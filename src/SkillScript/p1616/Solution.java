package SkillScript.p1616;

public class Solution {
    public static void solve(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        solve("hello");
    }
}
