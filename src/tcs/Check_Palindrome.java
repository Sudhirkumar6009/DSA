package tcs;

public class Check_Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int half = 0;
        while (x > half) {
            half = (half * 10) + (x % 10);
            x /= 10;
        }
        System.out.println(half);
        System.out.println(x);
        return x == half || x == half / 10;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1456776541));
    }
}
