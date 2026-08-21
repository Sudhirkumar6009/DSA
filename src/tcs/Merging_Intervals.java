package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Merging_Intervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] vals = new int[n][2];
        for (int i = 0; i < n; i++) {
            String str = scan.nextLine();
            String[] num_extr = str.split("\\s+");
            vals[i][0] = Integer.parseInt(num_extr[0]);
            vals[i][1] = Integer.parseInt(num_extr[1]);
        }
        Arrays.sort(vals, (a, b) -> Integer.compare(a[0], b[0])); // Most important
        int start = vals[0][0];
        int end = vals[0][1];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i][0] <= end) {
                end = Math.max(end, vals[i][1]);
            } else {
                System.out.println(start + " " + end);
                start = vals[i][0];
                end = vals[i][1];
            }
        }
        System.out.println(start + " " + end);
    }
}
