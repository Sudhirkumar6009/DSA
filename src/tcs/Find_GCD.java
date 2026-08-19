package tcs;

import java.util.*;
public class Find_GCD
{
    public static void find_gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.print(Math.abs(a));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine().trim();
        String[] tokens = line.split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        find_gcd(arr[0], arr[1]);
    }
}
