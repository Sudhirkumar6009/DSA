package leetcode.p2390;

import java.util.Stack;

public class Solution {
    static public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (Character ch: s.toCharArray()){
            if (ch == '*') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        for (Character ch: stack) {
            str.append(ch);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}