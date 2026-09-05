package leetcode.p287;

public class CircularSortApproachSolution {
    public static int findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicates(nums));
    }
}
