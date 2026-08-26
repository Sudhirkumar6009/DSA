package leetcode.p2904;
class Solution {
    public static String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int count = 0;
        String ans = "";
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                count++;
                if (count == k) {
                    while (s.charAt(left) == '0') {
                        left++;
                    }
                    String current = s.substring(left, right + 1);

                    if (ans.equals("") || current.length() < ans.length() || (current.length() == ans.length() && current.compareTo(ans) < 0)) {
                        ans = current;
                    }
                    left++;
                    count--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;
        System.out.println(shortestBeautifulSubstring(s,k));
    }
}