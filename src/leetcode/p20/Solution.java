package leetcode.p20;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    static public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean ans = false;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('[',-2);
        hashmap.put(']',2);
        hashmap.put('{',-1);
        hashmap.put('}',1);
        hashmap.put('(',-3);
        hashmap.put(')',3);
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            if (hashmap.containsKey(word)) {
                int val = hashmap.get(word);
                if (val < 0) {
                    stack.push(val);
                }
                else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() + val == 0) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            System.out.println("Contains");
        }
        System.out.println(hashmap);
        System.out.println(stack);
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[]{}(";
        System.out.println(isValid(s));
    }
}
