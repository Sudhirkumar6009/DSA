package tcs;

import java.util.HashSet;

public class Remove_Duplicate_Element_In_LL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void return_Duplicate(ListNode head) {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        ListNode prev = new ListNode(0);
        ListNode curr = head;
        prev.next = curr;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(curr.val);
        while (curr.next != null) {
            curr = curr.next;
            prev = prev.next;
            if (hashSet.contains(curr.val)) {
                prev.next = prev.next.next;
                System.out.println(curr.val);
                break;
            } else {
                hashSet.add(curr.val);
            }
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return_Duplicate(node1);
    }
}
