package tcs;

import java.util.Scanner;

public class Perfect_Num {
    public static void isPerfect(int num) {
        int ans = 1;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                ans+=i;
            }
        }
        if (ans == num) System.out.print("Perfect");
        else System.out.print("Not Perfect");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPerfect(num);
    }
}
