package tcs;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_Substring_with_no_Repitition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int left = 0;
        int right = str.length()-1;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for (right = 0; right < str.length(); right++) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
            } else {
                maxLen = Math.max(maxLen,right-left);
                left++;
            }
        }
        System.out.print(maxLen);
    }
}
