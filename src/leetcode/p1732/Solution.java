package leetcode.p1732;

public class Solution {
    static public int largestAltitude (int[] gain) {
        int[] prefixSum = new int[gain.length-1];
        int max = prefixSum[0];

        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
