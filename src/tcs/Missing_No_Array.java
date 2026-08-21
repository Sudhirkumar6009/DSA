package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_No_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String num = scan.nextLine();
        String[] tokens = num.split(", ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(arr);
        int range = (n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) {
            range -= arr[i];
        }
        System.out.println(range);
    }
}
