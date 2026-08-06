package leetcode.p237;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode next = curr.next;
        curr.val = next.val;
        curr.next = curr.next.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        deleteNode(n2);
    }
}
