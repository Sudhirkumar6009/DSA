package SkillScript.p1071;

public class Solution {
    public static void revArray(int[] nums) {

        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i]+", ");
        }
    }

    public static void main(String[] args) {
        revArray(new int[]{10,20,30,40});
    }
}
