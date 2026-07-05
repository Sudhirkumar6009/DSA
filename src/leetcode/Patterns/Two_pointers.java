package leetcode.Patterns;

import java.util.ArrayList;
import java.util.List;

public class Two_pointers {
    static public List<Integer> two_pointer(int[] arr, int val) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int current_sum = arr[left]+arr[right];
            if (current_sum == val) {
                list.add(arr[left]);
                list.add(arr[right]);
                break;
            }
            else if (current_sum < val ) {
                left++;
            } else {
                right--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,23,42,13,78,230};
        System.out.println(two_pointer(arr, 308));
    }
}
