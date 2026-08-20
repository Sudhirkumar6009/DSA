package tcs;

import java.util.Scanner;

public class Check_Max_No_From_Str {
    public static void check_max_no_in_str(String str) {
        int max = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + str.charAt(i) - '0';
            } else {
                max = Math.max(max,num);
                num = 0;
            }
        }
        max = Math.max(max,num);
        System.out.print(max);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        check_max_no_in_str(str);
    }
}
