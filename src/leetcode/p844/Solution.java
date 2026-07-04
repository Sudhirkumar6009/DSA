package leetcode.p844;

import java.util.Stack;

public class Solution {
    static public boolean backspaceCompare(String s, String t) {
        boolean match = stack_map(s).equals(stack_map(t));
        return match;
    }
    static public Stack<Character> stack_map(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()){
            if (ch == '#') {
                if (stack.isEmpty()) continue;
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack;
    }
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
