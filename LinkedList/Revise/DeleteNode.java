package LinkedList.Revise;

import LinkedList.Node;

import java.util.HashMap;
import java.util.Map;

class Main {
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

public class DeleteNode {
    public void deleteNode(Node node) {
        Node prev = node;
        while (node != null) {
            if (node.next == null) {
                prev.next = null;
                break;
            } else {
                node.data = node.next.data;
                prev = node;
                node = node.next;
            }
        }
        return;
    }
}
