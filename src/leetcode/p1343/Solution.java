package leetcode.p1343;

public class Solution {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        if (sum/k >= threshold) count++;
        for (int i = 1; i <= arr.length-k; i++) {
            sum+=arr[i+k-1];
            sum-=arr[i-1];
            if (sum/k >= threshold) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}
