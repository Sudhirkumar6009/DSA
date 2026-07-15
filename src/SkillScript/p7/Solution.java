package SkillScript.p7;

public class Solution {
    static public void swapNumbers(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        swapNumbers(10,20);
    }
}
