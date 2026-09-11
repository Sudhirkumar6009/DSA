package leetcode.p191;

public class Solution {
    public static int hammingWeight(int n) {
        if (n==0) return 0;
        return (n%2)+hammingWeight(n/2);
    }
    public static void main(String[] args) {
        int n = 128;
        System.out.println(hammingWeight(n));
    }
}
