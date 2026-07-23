package leetcode.Patterns;

public class Dynamic_Sliding_Window {
    public static int minLength(int arr[], int n, int k) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        System.out.println(minLen);

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int n = arr.length;
        int k = 7;
        System.out.println(minLength(arr,n,k));
    }
}
