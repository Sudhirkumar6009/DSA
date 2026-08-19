package tcs;

import java.util.Scanner;

public class Palindrome_Number {
    public static void palindrome(int num) {
        if (num < 0) {
            System.out.print("Not Possible");
            return;
        }
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int lastDigit = num%10;
            reversedNum = (reversedNum * 10) + lastDigit;
            num /= 10;
        }
        if (originalNum == reversedNum) System.out.print("Palindrome");
        else System.out.print("Not Palindrome");

    }
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        palindrome(num);
    }
}
