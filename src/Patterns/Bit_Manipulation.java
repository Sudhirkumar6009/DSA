package Patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bit_Manipulation {

//    1. PROBLEM : ODD ONE OUT from pairs
//       APPROACH : XOR All elements -> pairs cancel out (a^a=0), one remains
    public static int singleNumber (int[] nums) {
        int result = 0;
        for (int num: nums) {
            result ^= num;
        }
        return result;
    }

//    2. PROBLEM : Number of 1 Bits
//       APPROACH : n & ( n - 1 ) clears the lowest set bit each iteration
    public static int hammingBits(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }

//    3. PROBLEM : Counting Bits
//       APPROACH : DP -> dp[i] = dp[i >> 1] + (i & 1)
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;
    }

//    4. PROBLEM : Power of Two
//       APPROACH : Only one bit set -> n & (n-1) == 0
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }

//    5. PROBLEM : Missing Number
//       APPROACH : XOR indices with values; missing number survives
    public static int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }


//    6. PROBLEM : Sum of Two Integers (without add (+) operator)
//       APPROACH : sum = a^b (add without carry), (carry) = (a&b)<<1, repeat
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

//    7. PROBLEM : Reverse Bits
//       APPROACH :shift result left, OR int n's last bit, shift n right
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>>= 1;
        }
        return result;
    }

//    8. PROBLEM : Hamming Distance
//       APPROACH : XOR then count set bits

    public static int hammingDistance (int x, int y) {
        return Integer.bitCount(x ^ y);
    }

//    9. PROBLEM : Single Number II - every Element appears 3 times except one
//       APPROACH : add ones/twos bitmask state machine

    public static int singleNumberII(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

//    10. PROBLEM : Single Number III - two numbers appears once, rest twice
//        APPROACH : XOR all -> get diff bit -> split two group by that bit

    public static int[] singleNumberIII(int[] nums) {
        int xorAll = 0;
        for (int num : nums) xorAll ^= num;

        // rightmost set bit (a bit where the two answers differ)
        int diffBit = xorAll & (-xorAll);

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

//    11. PROBLEM : Subsets
//        APPROACH : iterate mask 0...2^n-1, each bit = include/exclude element

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }
        return result;
    }

//    12. PROBLEM : Bitwise AND of Numbers Range
//        APPROACH : Right-Shift both till equal -> common prefix, shift back

    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }

//    13. PROBLEM : Maximum XOR of Two Numbers in an Array
//        APPROACH : Build binary Trie (MSB -> LSB), Greedily pick opposite bit

    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int max = 0;

        for (int num : nums) {
            // Insert into trie
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }

            // Query for max XOR with numbers already inserted
            node = root;
            int currXor = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int opposite = 1 - bit;
                if (node.children[opposite] != null) {
                    currXor |= (1 << i);
                    node = node.children[opposite];
                } else {
                    node = node.children[bit];
                }
            }
            max = Math.max(max, currXor);
        }
        return max;
    }

//    14. PROBLEM : Power of Four
//        APPROACH : Power-of-2 check + set a bit at an even position (0x55555555)

    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

//    15. PROBLEM : XOR queries of a Subarray
//        APPROACH : prefix XOR Array -> XOR(l,r) = prefix[r+1] ^ prefix[l]

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            result[i] = prefix[r + 1] ^ prefix[l];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("1. Single Number from {4,1,2,1,2} -> "+singleNumber(new int[]{4,1,2,1,2}));
        System.out.println("2. Number of 1 Bits in {7} -> "+hammingBits(7));
        System.out.println("3. Counting Bits upto {8} -> "+ Arrays.toString(countBits(8)));
        System.out.println("4. Power of Two Possible from {32} -> "+ isPowerOfTwo(32));
        System.out.println("5. Missing Number from {3,0,1} -> "+missingNumber(new int[] {3,0,1}));
        System.out.println("6. Sum of {10} and {15} Integers -> "+getSum(10,15));
        System.out.println("7. Reverse Bits of {20} -> "+reverseBits(20));
        System.out.println("8. Hamming Distance of {15} and {10} -> "+hammingDistance(15,10));
        System.out.println("9. Single Number II of {2,2,3,2} -> "+singleNumberII(new int[] {2,2,3,2}));
        System.out.println("10. Single Number III of {1,2,1,3,2,5} -> "+Arrays.toString(singleNumberIII(new int[] {1,2,1,3,2,5})));
        System.out.println("11. Subsets of {1,2,3} -> "+subsets(new int[] {1,2,3}));
        System.out.println("12. Bitwise AND of Numbers Range from {5} to {7} -> "+rangeBitwiseAnd(5,7));
        System.out.println("13. Maximum XOR of Two Numbers from {3,10,5,25,2,8} -> "+findMaximumXOR(new int[] {3,10,5,25,2,8}));
        System.out.println("14. Power of Four Possible from {64} -> "+isPowerOfFour(64));
        System.out.println("15. XOR Queries of a SubArrays -> \nArray : {1,3,4,8} \nSubArray : {{0,1},{1,2},{0,3},{3,3}} -> "+Arrays.toString(xorQueries(new int[] {1,3,4,8}, new int[][] {{0,1},{1,2},{0,3},{3,3}})));
    }
}
