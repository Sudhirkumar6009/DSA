package Array;

import java.util.Arrays;

public class Array_Create {

    public static void main(String[] args) {
        int[] arr = new int[1];
        int[] arr2 = {12,23,34,45,94,56};

        System.out.println(arr2[4]);

        for (Integer a : arr) {
            System.out.println(a);
        }
        System.out.println(arr.length);
        Arrays.sort(arr2);
        for (Integer ar: arr2) {
            System.out.println(ar);
        }
    }
}
