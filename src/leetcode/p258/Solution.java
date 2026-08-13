package leetcode.p258;

public class Solution {
    public static int addDigits(int num) {
        if (num/10 == 0) return num;
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num/=10;
        }
        return addDigits(sum);
    }
    public static void main(String[] args) {
        System.out.println(addDigits(50));
    }
}
