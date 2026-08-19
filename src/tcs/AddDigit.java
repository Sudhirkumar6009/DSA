package tcs;

import java.util.Scanner;

public class AddDigit {
    public static void sum_of_digits(int num) {
        int digit = 0;
        while (num != 0) {
            digit+=num%10;
            num/=10;
        }
        System.out.print(digit);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        sum_of_digits(num);
    }
}
