package leetcode.p1539;

public class Solution {
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int missing = arr[i] - (i+1);
            if (missing >= k) {
                return i + k;
            }
        }
        int missing = arr[arr.length-1] - arr.length;
        return arr[arr.length-1] + (k - missing);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 15;
        System.out.println(findKthPositive(arr,k));
    }
}
