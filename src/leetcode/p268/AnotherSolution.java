package leetcode.p268;

public class AnotherSolution {
    public static int missingNumber(int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans ^= i;
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0};
        System.out.println(missingNumber(nums));
    }
}
