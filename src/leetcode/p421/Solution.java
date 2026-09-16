package leetcode.p421;

public class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    public static int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int max = 0;

        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }

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
    public static void main(String[] args) {
        System.out.println(findMaximumXOR(new int[] {3,10,5,25,2,8}));
    }
}
