package Revise;
public class Node {

    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int d) {
        data = d;
        next = null;
    }
}
