package leetcode.p765;

public class Solution {
    public static int minSwapsCouples (int[] row) {
        int n = row.length;
        int i = 0;
        int swaps = 0;
        while (i < n) {
            if (row[i]%2==0 && row[i+1] != row[i]+1) {
                int dummy = i;
                while (dummy < row.length) {
                    if (row[dummy] != row[i]+1) {
                        dummy++;
                    } else if (row[dummy] == row[i] + 1){
                        int temp = row[dummy];
                        row[dummy] = row[i+1];
                        row[i+1] = temp;
                        swaps++;
                        break;
                    } else {
                        dummy++;
                    }
                }
                i+=2;
            } else if (row[i]%2!=0 && row[i+1] != row[i]-1) {
                int dummy = i;
                while (dummy < row.length) {
                    if (row[dummy] != row[i]-1) {
                        dummy++;
                    } else if (row[dummy] == row[i] - 1){
                        int temp = row[dummy];
                        row[dummy] = row[i+1];
                        row[i+1] = temp;
                        swaps++;
                        break;
                    } else {
                        dummy++;
                    }
                }
                i+=2;
            }
            else {
                i+=2;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        int[] row = {0,2,1,3};
        System.out.println(minSwapsCouples(row));
    }
}
