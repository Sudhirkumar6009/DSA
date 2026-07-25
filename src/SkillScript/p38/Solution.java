package SkillScript.p38;

import java.util.HashMap;

public class Solution {
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num: arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
        }
        for (int key: arr) {
            if (hashMap.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(firstNonRepeating(arr));
    }
}
