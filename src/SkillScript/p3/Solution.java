package SkillScript.p3;

public class Solution {
    static public long ceilDivide(long a, long b) {
        long val = 0;
        if (a%b !=0) {
            val = (a / b)+1;
        } else {
            val = a/b;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(ceilDivide(12, 4));
    }
}
