package leetcode.p23;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeSortedList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    public static ListNode mergeKHelper(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        if (start + 1 == end) {
            return mergeSortedList(lists[start], lists[end]);
        }
        int mid = start + (end - start)/2;
        ListNode left = mergeKHelper(lists, start, mid);
        ListNode right = mergeKHelper(lists, mid+1, end);
        return mergeSortedList(left,right);
    }

    public static ListNode mergeKList(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        return mergeKHelper(lists,0,lists.length-1);
    }


    public static void main(String[] args) {
        ListNode nA1 = new ListNode(1);
        ListNode nA2 = new ListNode(4);
        ListNode nA3 = new ListNode(5);

        nA1.next = nA2;
        nA2.next = nA3;

        ListNode nB1 = new ListNode(1);
        ListNode nB2 = new ListNode(3);
        ListNode nB3 = new ListNode(4);

        nB1.next = nB2;
        nB2.next = nB3;

        ListNode nC1 = new ListNode(2);
        ListNode nC2 = new ListNode(6);

        nC1.next = nC2;

        ListNode[] lists = {nA1,nB1,nC1};

        System.out.println(mergeKList(lists).val);
    }
}
