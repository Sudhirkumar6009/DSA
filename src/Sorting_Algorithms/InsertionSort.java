package Sorting_Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2,3,44,3,6,7,5,66,90};
        for (int i = 1; i < nums.length ; ++i) {
            int key = nums[i];
            int j = i-1;
            while (j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
            System.out.println(Arrays.toString(nums));
    }
}
