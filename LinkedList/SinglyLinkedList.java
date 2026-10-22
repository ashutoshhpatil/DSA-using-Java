package Linkedlist;

class Node {
    int data;
    Node next = null;

}

class Linkedlist {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);
    }

}

class client {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(10);
    }
}