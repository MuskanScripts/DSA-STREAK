public class RemoveDuplicatesFromLL {
    public Node deleteDuplicates(Node head) {
        Node temp = head;
        func(temp);
        return head;
    }

    static void func(Node node) {
        if (node == null)
            return;
        while (node.next != null && node.data == node.next.data) {
            node.next = node.next.next;
        }
        func(node.next);
    }
}
