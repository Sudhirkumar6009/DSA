package leetcode.p1732;

public class Solution {
    static public int largestAltitude (int[] gain) {
        int[] prefixSum = new int[(gain.length)+1];
        int max = prefixSum[0];
        prefixSum[0] = max;
        for (int i = 0; i < gain.length; i++) {
            prefixSum[i+1] = prefixSum[i] + gain[i];
            if (max < prefixSum[i+1]) max = prefixSum[i+1];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}
