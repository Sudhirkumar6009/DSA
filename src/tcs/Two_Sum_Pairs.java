package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum_Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(arr[i])) {
                System.out.print("Yes");
            }
            hashMap.put(target-arr[i], arr[i]);
        }
    }
}
