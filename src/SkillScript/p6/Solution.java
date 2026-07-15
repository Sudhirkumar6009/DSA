package SkillScript.p6;

public class Solution {
    static public void checkPalindrome(int n) {
        String num = String.valueOf(n);
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt((num.length()-i)-1)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        checkPalindrome(123921);
    }
}
