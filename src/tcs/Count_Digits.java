package tcs;

import java.util.Scanner;

public class Count_Digits {
    public static void count_digits(int num) {
        int len = 0;
        while (num != 0) {
            int n = num%10;
            len++;
            num/=10;
        }
        System.out.print(len);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        count_digits(num);
    }
}
