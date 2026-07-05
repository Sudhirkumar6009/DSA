package leetcode.p13;

import java.util.HashMap;
import java.util.Objects;

public class Solution {
    static public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                if (i == s.length()-1) {
                    ans = ans + hashMap.get(s.charAt(i));
                } else if (hashMap.get(s.charAt(i)) > hashMap.get(s.charAt(i+1))) {
                    ans = ans + hashMap.get(s.charAt(i));
                } else if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i+1))) {
                    ans = ans + (hashMap.get(s.charAt(i+1))-hashMap.get(s.charAt(i)));
                    i+=1;
                } else {
                    ans = ans + hashMap.get(s.charAt(i));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String roman = "XII";
        System.out.println(romanToInt(roman));
    }
}
