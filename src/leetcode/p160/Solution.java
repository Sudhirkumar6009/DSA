package leetcode.p160;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        int lenA = 0;
        int lenB = 0;

        while (ptrA != null) {
            lenA++;
            ptrA = ptrA.next;
        }
        while (ptrB != null) {
            lenB++;
            ptrB = ptrB.next;
        }

        ptrA = headA;
        ptrB = headB;

        while (lenA > lenB) {
            lenA--;
            ptrA = ptrA.next;
        }
        while (lenA < lenB) {
            lenB--;
            ptrB = ptrB.next;
        }
        while (ptrA != ptrB) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        return ptrA;
    }

    public static void main(String[] args) {

        ListNode nodeA1 = new ListNode(4);
        ListNode nodeA2 = new ListNode(1);
        ListNode nodeB1 = new ListNode(5);
        ListNode nodeB2 = new ListNode(6);
        ListNode nodeB3 = new ListNode(1);
        ListNode nodeC1 = new ListNode(8);
        ListNode nodeC2 = new ListNode(4);
        ListNode nodeC3 = new ListNode(5);

        nodeA1.next = nodeA2;
        nodeA2.next = nodeC1;
        nodeB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeC1;
        nodeC1.next = nodeC2;
        nodeC2.next = nodeC3;

        System.out.println(getIntersectionNode(nodeA1, nodeB1).val);
    }
}
