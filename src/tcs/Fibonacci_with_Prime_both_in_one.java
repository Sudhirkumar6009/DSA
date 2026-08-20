package tcs;

import java.util.Scanner;

public class Fibonacci_with_Prime_both_in_one {
    public static int nextPrime(int num) {
        while (true) {
            boolean  isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return num;
            }
            num++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int prime = 2;
        for(int i = 1; i < n; i++) {
            if ( i % 2 == 0 ) {
                // prime nums
                System.out.print(prime + " ");
                prime = nextPrime(prime+1);
            } else {
                // fibonacci
                System.out.print(fib1 + " ");
                    int next = fib1+ fib2;
                    fib1 = fib2;
                    fib2 = next;
            }
        }
    }
}
