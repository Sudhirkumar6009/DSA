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

        System.out.println(getIntersectionNode(nodeA1, nodeB1));
    }
}
