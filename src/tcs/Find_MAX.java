package tcs;

import java.util.Scanner;

public class Find_MAX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();
        String[] strs = str.split("\\s+");
        int len = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(strs[i]);
            len = Math.max(len, num);
        }
        System.out.print(len);
    }
}
