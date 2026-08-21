package tcs;

import java.util.Scanner;

public class Zeroes_to_end {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        String[] str = scan.nextLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] ans = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) ans[num++] = arr[i];
        }
        for (int val : ans) {
            System.out.print(val+" ");
        }
    }
}
