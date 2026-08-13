package tcs;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int half = 0;
        while (x > half) {
            half = (half * 10) + (x % 10);
            x /= 10;
        }
        return x == half || x == half / 10;
    }
    public static void main (String args[]) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
