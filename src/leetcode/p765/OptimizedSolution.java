package leetcode.p765;

public class OptimizedSolution {
    public static int minSwapsCouples (int[] row) {
        int swaps = 0;
        for (int i = 0; i < row.length; i+=2) {
            int partner = row[i] ^ 1;
            if (row[i+1] == partner) continue;
            for (int j = i+2; j < row.length; j++) {
                if (row[j] == partner) {
                    int temp = row[i+1];
                    row[i+1] = row[j];
                    row[j] = temp;
                    swaps++;
                    break;
                }
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        int[] row = {0,2,1,3};
        System.out.println(minSwapsCouples(row));
    }
}
