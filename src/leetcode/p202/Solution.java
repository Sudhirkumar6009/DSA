package leetcode.p202;

public class Solution {
    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        else if (n < 10) return false;
        else {
            int sum = 0;
            while (n > 0) {
                int num = 0;
                num = n % 10;
                n /= 10;
                sum+=(num*num);
            }
            return isHappy(sum);
        }
    }
    public static void main(String[] args) {
        System.out.println(isHappy(9));
    }
}
