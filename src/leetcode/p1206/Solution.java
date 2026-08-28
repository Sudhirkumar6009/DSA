package leetcode.p1206;

import java.util.Random;
import java.util.Stack;

class Skiplist {
    SkipNode head;
    public Skiplist() {
        head = new SkipNode(-1);
    }

    public boolean search(int target) {
        SkipNode node = head;
        while (node != null) {
            while (node.next != null && node.next.val < target) {
                node = node.next;
            }

            if (node.next != null && node.next.val == target) {
                return true;
            }
            node = node.down;
        }
        return false;
    }

    public void add(int num) {
        SkipNode node = head, down = null;
        boolean shouldAdd = true;
        Stack<SkipNode> stack = new Stack<>();
        while (node != null) {
            while (node.next != null && node.next.val < num) {
                node = node.next;
            }
            stack.push(node);
            node = node.down;
        }
        while (shouldAdd && !stack.isEmpty()) {
            SkipNode sn = stack.pop();
            SkipNode newNode = new SkipNode(num, sn.next, down);
            sn.next = newNode;
            down = newNode;
            shouldAdd = new Random().nextInt(2) == 1;
        }
    }

    public boolean erase(int num) {
        SkipNode node = head;
        boolean found = false;
        while (node != null) {
            while (node.next != null && node.next.val < num) {
                node = node.next;
            }
            if (node.next != null && node.next.val == num) {
                node.next = node.next.next;
                found = true;
            }
            node = node.down;
        }
        return found;
    }

    class SkipNode {
        SkipNode next, down;
        int val;
        public SkipNode(int val) {
            this.val = val;
        }

        public SkipNode(int val, SkipNode next, SkipNode down) {
            this(val);
            this.next = next;
            this.down = down;
        }
    }
}


public class Solution {
    public static void main(String[] args) {

        Skiplist obj = new Skiplist();

        obj.add(1);
        obj.add(2);
        obj.add(3);

        System.out.println(obj.search(0)); // false

        obj.add(4);

        System.out.println(obj.search(1)); // true
        System.out.println(obj.search(4)); // true

        System.out.println(obj.erase(3)); // true
        System.out.println(obj.search(3)); // false
    }
}
