package tcs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Find_Duplicate_In_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            if (set.contains(num)) {
                System.out.print(num);
            } else {
                set.add(num);
            }
        }
    }
}
