public class AddNumberLL {

    public Node addTwoNumbers(Node l1, Node l2) {
        Node h1 = l1;
        Node h2 = l2;
        Node ans = new Node(0);
        Node dummy = ans;
        int p = 0;
        while (h1 != null && h2 != null) {
            int k = h1.data + h2.data + p;
            Node ok = new Node((k) % 10);
            p = k / 10;
            dummy.next = ok;
            dummy = dummy.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        while (h1 != null) {
            int k = h1.data + p;
            Node ok = new Node((k) % 10);
            p = k / 10;
            dummy.next = ok;
            dummy = dummy.next;
            h1 = h1.next;
        }
        while (h2 != null) {
            int k = h2.data + p;
            Node ok = new Node((k) % 10);
            p = k / 10;
            dummy.next = ok;
            dummy = dummy.next;
            h2 = h2.next;
        }
        while (p != 0) {
            Node ok = new Node((p) % 10);
            p = p / 10;
            dummy.next = ok;
            dummy = dummy.next;
        }
        return ans.next;
    }
}
