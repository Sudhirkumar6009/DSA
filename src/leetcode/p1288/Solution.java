package leetcode.p1288;

import java.util.Arrays;

public class Solution {
    static public int removeCoveredIntervals(int[][] intervals) {
        int ans = 0;
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            boolean isCovered = false;
            for (int j = 0; j < n; j++) {
                if (i==j) continue;
                if ((intervals[j][0] <= intervals[i][0]) && (intervals[i][1] <= intervals[j][1])) {
                    isCovered = true;
                    break;
                }
            }
            if (isCovered) {
                ans+=1;
            }
        }
        return n-ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{3,6},{2,8}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}
