package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_No_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            if (arr[i]+1 != arr[i+1]) {
                System.out.println(arr[i]+1);
            }
        }
    }
}
