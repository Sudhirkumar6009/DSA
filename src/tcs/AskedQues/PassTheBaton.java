package tcs.AskedQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassTheBaton {
    public static List<Integer> passing_Left_Right(int[] arr, long time) {
        List<Integer> list = new ArrayList<>();
        boolean ans = false;
        for (int i = 1; i < arr.length; i++) {
            if (time == 0) {
                ans = true;
                list.add(arr[i]);
                list.add(arr[i-1]);
                break;
            }
            time--;
        }
        if (!ans) return passing_Right_Left(arr,time);
        return list;
    }
    public static List<Integer> passing_Right_Left(int[] arr, long time) {
        List<Integer> list = new ArrayList<>();
        boolean ans = false;
        for (int i = arr.length-2; i >= 0; i--) {
            if (time == 0) {
                ans = true;
                list.add(arr[i]);
                list.add(arr[i+1]);
                break;
            }
            time--;
        }
        if (!ans) return passing_Left_Right(arr,time);
        return list;
    }
    public static List<Integer> passTheBaton(int friends, long time) {
        int[] arr = new int[friends];
        for (int i = 0; i < friends; i++) {
            arr[i] = i+1;
        }
        return passing_Left_Right(arr, time);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int friends = scan.nextInt();
        long time = scan.nextLong();
        System.out.println(passTheBaton(friends, time));
    }
}