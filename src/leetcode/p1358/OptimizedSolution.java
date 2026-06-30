package leetcode.p1358;

import java.util.HashSet;

public class OptimizedSolution {
    static public int numberOfStrings(String s) {
        int[] count = new int[3];
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaacb";
        System.out.println(numberOfStrings(str));
    }
}
