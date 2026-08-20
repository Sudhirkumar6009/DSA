package tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_Second_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] nums = line.split("\\s+");
        List<Integer> list = new ArrayList<>();
        for (String x : nums) {
            int num = Integer.parseInt(x);
            list.add(num);
        }
        int max = Integer.MIN_VALUE;
        int second_max = max;
        for (int num : list) {
            if (num > max) {
                second_max = max;
                max = num;
            } else if (num > second_max && num < max) {
                second_max = num;
            }
        }
        if (second_max == Integer.MIN_VALUE) {
            System.out.print("No distinct value");
        } else {
            System.out.print(second_max);
        }
    }
}
