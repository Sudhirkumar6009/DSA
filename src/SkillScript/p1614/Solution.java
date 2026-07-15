package SkillScript.p1614;

public class Solution {
    static public void solve(int n) {
        if (n <= 0) {
            System.out.print("Input must be greater then Zero");
            return;
        }
        if (n == 1) {
            System.out.print(5);
            return;
        }
        long first = 5;
        long second = 6;
        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
