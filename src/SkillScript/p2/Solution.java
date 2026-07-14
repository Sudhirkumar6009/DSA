package SkillScript.p2;

public class Solution {
    static public long digitSum (long n) {
        long sum = 0;
        while (n > 0) {
            long digit = n % 10;
            sum+=digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(12312));
    }
}
