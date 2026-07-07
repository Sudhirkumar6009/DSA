package leetcode.Patterns;

import java.util.Arrays;
public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78};
        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefixArray));
    }
}
