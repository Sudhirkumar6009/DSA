package leetcode.p2812;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static public int maximumSafenessFactor(List<List<Integer>> grid) {
        return 1;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(List.of(1,0,0));
        grid.add(List.of(0,0,0));
        grid.add(List.of(0,0,1));
        System.out.println(grid);
        System.out.println(maximumSafenessFactor(grid));
    }
}
