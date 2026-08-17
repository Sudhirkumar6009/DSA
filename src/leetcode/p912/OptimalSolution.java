package leetcode.p912;

import java.util.Arrays;

public class OptimalSolution {
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    static void quickSort(int[] a, int l, int r) {
        if (l >= r) return;
        int pivot = a[l + (int)(Math.random() * (r - l + 1))];
        int i = l, j = l, k = r;
        while (j <= k) {
            if (a[j] < pivot) {
                swap(a, i++, j++);
            }
            else if (a[j] > pivot) {
                swap(a, j, k--);
            }
            else {
                j++;
            }
        }
        quickSort(a, l, i - 1);
        quickSort(a, k + 1, r);
    }
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main (String[] args) {
        int[] nums = {5,3,2,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
