package leetcode.p1456;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int maxVowels(String s, int k) {
        List<Character> list_of_vowel = new ArrayList<>();
        list_of_vowel.add('a');
        list_of_vowel.add('e');
        list_of_vowel.add('i');
        list_of_vowel.add('o');
        list_of_vowel.add('u');
        int Max_vowels = 0;
        int current = 0;
        for (int i = 0; i < k; i++){
            if (list_of_vowel.contains(s.charAt(i))) current++;
            Max_vowels = current;
        }
        for (int i = 1; i <= s.length()-k; i++) {
            if (list_of_vowel.contains(s.charAt(i-1))) {
                current--;
            }
            if (list_of_vowel.contains(s.charAt(k+i-1))) {
                current++;
            }
            if (current > Max_vowels) Max_vowels = current;
        }
        return Max_vowels;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
}
