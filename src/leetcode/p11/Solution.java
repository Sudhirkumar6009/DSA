package leetcode.p11;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int maxArea(int[] height) {
        int res = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        int[][] arr = new int[height.length][height.length];
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int min = Math.min(height[i], height[j]);
                arr[i][j] = min*j;
            }
        }
        for (int[] num: arr){
            System.out.println(Arrays.toString(num));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
