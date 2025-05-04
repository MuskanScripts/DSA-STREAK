package Revise;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) { val = x; }
    ListNode(int x, ListNode next) { val = x; this.next = next; }
    public String toString() {
        return String.valueOf(val);
    }
}
