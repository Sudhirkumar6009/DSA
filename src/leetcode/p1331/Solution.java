package leetcode.p1331;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    static public int[] arrayRankTransform(int[] arr) {
        int[] actual = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        if (arr.length == 0) {
            return new int[0];
        }
        hashMap.put(arr[0], 1);
        int[] res = new int[arr.length];
        int current_rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                continue;
            } else {
                hashMap.put(arr[i], current_rank+1);
                current_rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(actual[i])) {
                res[i] = hashMap.get(actual[i]);
            };
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
