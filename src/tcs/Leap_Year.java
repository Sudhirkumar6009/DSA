package tcs;

import java.util.Scanner;

public class Leap_Year {
    public static void isLeap(int num) {
        if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)) System.out.print("Leap");
        else System.out.print("Not Leap");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isLeap(num);
    }
}
