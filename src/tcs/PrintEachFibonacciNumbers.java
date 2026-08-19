package tcs;

import java.util.Scanner;

public class PrintEachFibonacciNumbers {
    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= num; i++) {
            System.out.print(a+", ");
            int n = a+b;
            a = b;
            b = n;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fibonacci(num);
    }
}
