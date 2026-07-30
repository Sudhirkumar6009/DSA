package leetcode.p142;

import java.util.HashSet;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode slow = head;
        ListNode fast = head;
        boolean loop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                loop = true;
                break;
            }
        }
        ListNode temp = head;
        while (loop) {
            if (set.contains(temp)) {
                return temp;
            } else {
                set.add(temp);
                temp = temp.next;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(detectCycle(node1).val);
    }
}
