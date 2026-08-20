package tcs;

import java.util.Scanner;

public class Find_GCD_Recursion {
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return findGCD(num2,num1%num2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2= scan.nextInt();
        System.out.print(findGCD(num1, num2));
    }
}
