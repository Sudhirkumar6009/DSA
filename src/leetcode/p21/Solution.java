package leetcode.p21;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static ListNode mergeTwoLists (ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode nA1 = new ListNode(1);
        ListNode nA2 = new ListNode(2);
        ListNode nA3 = new ListNode(4);
        ListNode nB1 = new ListNode(1);
        ListNode nB2 = new ListNode(3);
        ListNode nB3 = new ListNode(4);

        nA1.next = nA2;
        nA2.next = nA3;
        nB1.next = nB2;
        nB2.next = nB3;

        System.out.println(mergeTwoLists(nA1, nB1).val);
    }
}
