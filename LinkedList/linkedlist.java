package Linkedlist;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // To add element at first:
    public void addFirst(int data) {
        // Step 1 - Create New Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 - newNode next = head
        newNode.next = head;

        // Step 3 - head = newNode
        head = newNode;

    }

    // To add element at last:
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;

    }

    // To add element at middle:
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // To print linkedlist:
    public void print() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.addMiddle(2, 5);
        ll.print();

        System.out.println("The size of Linked List is " + ll.size);

    }
}
