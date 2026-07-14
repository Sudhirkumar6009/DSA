package SkillScript.p1;

public class Solution {
    static void checkLuck(long n) {
        while (n > 0) {
            long digit = n % 10;
            if (n % 7 ==0) {
                System.out.println("Lucky");
                break;
            }
            if (digit == 7) {
                System.out.println("Lucky");
                break;
            } else { System.out.println("Not Lucky");
                n = n / 10;
                break;
            }
        }
    }

    public static void main(String[] args) {
        checkLuck(14);
    }
}
