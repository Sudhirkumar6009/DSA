package leetcode.Patterns;

public class SlidingWindow {
    static int max_sum(int[] arr, int window) {
        int current = 0;
        for (int i = 0; i < window; i++) {
            current+=arr[i];
        }
        int max = current;
        int n = arr.length;
        for (int j = 1; j <= n-window; j++) {
            current = current - arr[j-1] + arr[j+window-1];
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,2,5,7,6,12};
        int window = 2;
        System.out.println(max_sum(arr, window));
    }
}
