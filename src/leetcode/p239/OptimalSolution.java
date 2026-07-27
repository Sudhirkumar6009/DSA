package leetcode.p239;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class OptimalSolution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            if (deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            ans[i - k + 1] = nums[deque.peekFirst()];
        }
        return ans;
    }

    public static void main(String[] args) {
     int[] nums = {1,3,-1,-3,5,3,6,7};
     int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
}
