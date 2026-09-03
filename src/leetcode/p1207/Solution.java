package leetcode.p1207;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num: arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }
        for (int n : hashMap.values()) {
            set.add(n);
        }
        return set.size() == hashMap.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
