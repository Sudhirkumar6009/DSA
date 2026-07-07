package leetcode.p3754;

public class Solution {
    static public long sumAndMultiply(int n) {
        long ans = 0;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp/=10;
        }
        int[] arr = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        int sum = 0;
        long result = 0;
        for (int digit : arr) {
            if (digit == 0) {
                continue;
            }
            sum+=digit;
            result = (result*10) + digit;
        }
        ans = result*sum;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sumAndMultiply(1000));
    }
}
