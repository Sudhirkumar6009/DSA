package tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        String[] tokens1 = n1.split("\\s+");
        String n2 = scan.nextLine();
        String[] tokens2 = n2.split("\\s+");
        int[] arr1 = new int[tokens1.length];
        int[] arr2 = new int[tokens2.length];
        for (int i = 0; i < tokens1.length; i++) {
            arr1[i] = Integer.parseInt(tokens1[i]);
        }
        for (int i = 0; i < tokens2.length; i++) {
            arr2[i] = Integer.parseInt(tokens2[i]);
        }
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[arr1.length+arr2.length];
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < arr1.length && ptr2 < arr2.length) {
            if (arr1[ptr1] <= arr2[ptr2]) {
                list.add(arr1[ptr1]);
                ptr1++;
            } else {
                list.add(arr2[ptr2]);
                ptr2++;
            }
        }
        while (ptr1 < arr1.length) {
            list.add(arr1[ptr1]);
            ptr1++;
        }

        while (ptr2 < arr2.length) {
            list.add(arr2[ptr2]);
            ptr2++;
        }

        System.out.println(list);
    }
}
