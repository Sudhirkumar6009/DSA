package SkillScript.p37;

import java.util.HashSet;

public class Solution {
    public static int firstRepeating(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num: arr) {
            if (hashSet.contains(num)) {
                return num;
            }
            hashSet.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,6};
        System.out.println(firstRepeating(arr));
    }
}
