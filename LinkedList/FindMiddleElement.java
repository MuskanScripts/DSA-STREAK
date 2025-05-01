package LinkedList;
public class FindMiddleElement {
    // using fast and slow pointer approach to find the middle element of linked list
    // time complexity O(N) and space complexity O(1)
    static Node findMiddle(Node head) {
        Node slow = head; 
        Node fast = head;   
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;  
            slow = slow.next;        
        }
        return slow;
    }
}

// using brute force approach to find the middle element of linked list
// time complexity O(N+N/2) and space complexity O(1)
class FindMiddleOfLinkedList {
    static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2 + 1;
        temp = head;

        while (temp != null) {
            mid = mid - 1;
            if (mid == 0){
                break;
            }
            temp = temp.next;
        }

        return temp;
    }
}
