package leetcode.Patterns;

import java.util.Arrays;

public class Cyclic_Sort {
    public static int[] cyclic_sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        System.out.println(Arrays.toString(cyclic_sort(arr)));
    }
}
