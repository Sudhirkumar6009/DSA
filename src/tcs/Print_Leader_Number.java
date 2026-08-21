package tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Leader_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String nums = scan.nextLine();
        String[] tokens = nums.split("\\s+");
        int[] arr = new int[Integer.parseInt(n)];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("");
        int max = arr[arr.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >= max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
