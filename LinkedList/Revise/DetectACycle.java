package Revise;
import java.util.HashMap;
import java.util.Map;

public class DetectACycle {
    // 1st solution using two pointer approach
    // time complexity O(N) and space complexity O(1)
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }
}
class Main {
    // method to detect a cycle in the linked list using a hash map.
//time complexity O(N) and space complexity O(N)
    public static boolean detectLoop(Node head) {
        Node temp = head;
        Map<Node, Integer> nodeMap = new HashMap<>();
        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}
