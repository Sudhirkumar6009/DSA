import java.util.HashMap;

public class PrefixSum_Find_K_sum_Subarray {
    public static int countSubarrays (int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int count = 0;
        for (int num : nums) {
            sum += num;
            count += hashMap.getOrDefault(sum-k, 0);
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) +1);
        }
        return count;
    }
    public static void main(String[] args) {
            System.out.println(countSubarrays(new int[]{1,2,3,-2,2},3));
    }
}
