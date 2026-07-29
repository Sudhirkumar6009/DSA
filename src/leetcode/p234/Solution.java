package leetcode.p234;

import java.util.Stack;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        Stack<Integer> stack = new Stack<>();
        while (ptr != null) {
            stack.push(ptr.val);
            ptr = ptr.next;
        }

        ListNode ptr2 = head;
        while (ptr2 != null) {
            if (ptr2.val != stack.peek()) {
                return false;
            }
            stack.pop();
            ptr2 = ptr2.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;

        System.out.println(isPalindrome(node1));
    }
}
