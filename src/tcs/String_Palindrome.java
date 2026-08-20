package tcs;

import java.util.Scanner;

public class String_Palindrome {
    public static void check_Palindrom_Str(String str) {
        str = str.toUpperCase();
        int left = 0;
        int right = str.length()-1;
        boolean palindrome = false;
        while (left < right) {
            palindrome = str.charAt(left) == str.charAt(right);
            left++;
            right--;
        }
        if (palindrome) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        check_Palindrom_Str(str);
    }
}
