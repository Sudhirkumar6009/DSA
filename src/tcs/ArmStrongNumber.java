package tcs;

import java.util.Scanner;

public class ArmStrongNumber {
    public static int len(int num){
        int len = 0;
        while (num > 0) {
            len+=1;
            num/=10;
        }
        return len;
    }
    public static int pow(int num, int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans=num*ans;
        }
        return ans;
    }
    public static void checkArmstrong(int num) {
        int actual = num;
        int n = len(num);
        int val = 0;
        int ans = 0;
        while (num > 0) {
            val = num%10;
            ans+=pow(val,n);
            num/=10;
        }
        if (ans == actual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        checkArmstrong(num);
    }
}
