package leetcode.p25;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode reverseKGroup (ListNode head, int k) {
        ListNode temp = head;
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int executions = len/k;
        for (int i = 0; i < executions; i++) {
            ListNode prev = null;
            ListNode curr = groupPrev.next;
            ListNode groupHead = curr;
            int count = 0;
            while (curr != null && count < k) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            groupPrev.next = prev;
            groupHead.next = curr;

            groupPrev = groupHead;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(reverseKGroup(n1, 2).val);
    }
}
