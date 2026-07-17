package leetcode.p11;

public class Solution {
    public static int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i], height[j])*(j-i);
                res = Math.max(res,area);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] height = {12,23,34,45,56};
        System.out.println(maxArea(height));
    }
}
