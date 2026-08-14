package tcs;

import java.util.Scanner;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if (!Character.isLetterOrDigit(s.charAt(right))) right--;
            else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(isPalindrome(str));
    }
}
