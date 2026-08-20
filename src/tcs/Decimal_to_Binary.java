package tcs;

import java.util.Scanner;

public class Decimal_to_Binary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println(binary);
    }

}
