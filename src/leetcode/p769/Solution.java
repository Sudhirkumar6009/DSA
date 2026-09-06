package leetcode.p769;

public class Solution {
    public static int maxChunksToSorted(int[] arr) {
        int chunk = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                chunk++;
            }
        }
        return chunk;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        System.out.println(maxChunksToSorted(arr));
    }
}
