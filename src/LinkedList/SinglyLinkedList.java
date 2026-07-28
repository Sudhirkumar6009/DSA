package LinkedList;


public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int new_data) {
            this.data = new_data;
            this.next = null;
        }
    }
        Node head;

//    Insertion of an Element in Singly Linked List

    public void insertAtBeginning (int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtSpecificPosition (int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
        }
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position !!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

//    Deletion of an Element in Singly Linked List

    public void deleteBeginning() {
        if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
        head = head.next;
    }

    public void deleteEnd () {
        if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteByValue (int value) {
        if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not Found !");
            return;
        }
        temp.next = temp.next.next;
    }

//    Searching of an Element in Singly Linked List

    public void search (int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element ["+key+"] Found at Position : "+position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Element Not Found !");
    }

//    Display Singly Linked List

    public void display () {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

//    Count Nodes from Singly Linked List

    public int countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

//    Reverse Singly Linked List

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    //    Find Middle Element in Singly Linked List
    public void findMiddle() {
        if (head == null) {
            System.out.println("List is Empty !");
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element : "+slow.data);
    }
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtBeginning(5);
        list.insertAtSpecificPosition(15, 3);

        System.out.println("Linked List:");
        list.display();

        list.search(20);

        System.out.println("Total Nodes: " + list.countNodes());

        list.findMiddle();

        list.reverse();
        System.out.println("Reversed Linked List:");
        list.display();

        list.deleteBeginning();
        list.deleteEnd();
        list.deleteByValue(15);

        System.out.println("After Deletion:");
        list.display();
    }
}
