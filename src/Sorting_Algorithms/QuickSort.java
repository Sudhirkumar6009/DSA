package Sorting_Algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static int[] quickSortActual(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(Arrays.toString(quickSortActual(nums)));
    }
}
