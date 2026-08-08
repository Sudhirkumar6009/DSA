package leetcode.p328;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode oddEvenList (ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode curr2 = head.next;
        ListNode curr2Head = curr2;
        while (curr2 != null && curr2.next != null) {
            curr.next = curr2.next;
            curr2.next = curr.next.next;
            curr = curr.next;
            curr2 = curr2.next;
        }
        curr.next = curr2Head;
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

        System.out.println(oddEvenList(n1).val);
    }
}
