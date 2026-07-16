package SkillScript.p1382;

public class Solution {
    public static int findFirstStation(int[] water) {
        int total = 0;
        for (int num: water){
            total+=num;
        }
        long leftSum = 0;
        for (int i = 0; i < water.length; i++) {
            leftSum += water[i];
            long rightSum = total - leftSum;
            if (leftSum > rightSum) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] water = {5};
        System.out.println(findFirstStation(water));
    }
}
