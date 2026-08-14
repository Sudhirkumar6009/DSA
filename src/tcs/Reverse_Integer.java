package tcs;

import java.util.Scanner;

public class Reverse_Integer {
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0){
            int digit = x%10;
            if ((reverse > Integer.MAX_VALUE/10) || (reverse < Integer.MIN_VALUE/10)) {
                return 0;
            }
            reverse = reverse * 10 + digit;
            x/=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(reverse(num));
    }
}
