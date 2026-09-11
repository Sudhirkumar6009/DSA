package leetcode.p3483;

import java.util.HashSet;

public class Solution {
    public static int totalNumbers (int[] digits) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            int num = 1;
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    num = digits[i]*100;
                    num += digits[j]*10;
                    num += digits[k];
                    if (i != j && j != k && i != k && digits[i]*100 != 0 & num%2==0) {
                        hashSet.add(num);
                    }
                }
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        System.out.println(totalNumbers(digits));
    }
}
