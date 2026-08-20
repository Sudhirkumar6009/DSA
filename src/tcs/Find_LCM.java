package tcs;

import java.util.Scanner;

public class Find_LCM {
    public static int findLCM(int num1, int num2) {
        if (num1 == 0 || num2 == 0) return 0;
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int max = Math.max(a,b);
        int lcm = max;
        while (lcm % Math.min(a,b) != 0) {
            lcm += max;
        }
        return lcm;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2= scan.nextInt();
        System.out.print(findLCM(num1, num2));
        scan.close();
    }
}
