import java.util.*;
public class Reverse {
    //brute force using stack
    // time complexity O(N) and space complexity O(N)
    // where N is the length of linked list.
public static Node ReverseLinkedListUsingStack(Node head) {
            Node temp = head;
            Stack<Integer> s = new Stack<>();
            while(temp != null){
                s.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while(temp != null){
                temp.data = s.pop();
                temp = temp.next;
            }
return head;
    }
}    
// 2nd solution is using iterative approach to reverse the linked list
// time complexity O(N) and space complexity O(1)
class Reverse1 {
    public static Node ReverseLinkedList(Node head) {
                Node temp = head;
                Node prev = null;
                while(temp != null){
                    Node next = temp.next;
                    temp.next = prev;
                    prev = temp;
                    temp = next;
                }
        return prev;}
    }    

    //recursive approach to reverse the linked list
    // time complexity O(N) and space complexity O(1)
    class Reverse2 {
        public Node reverseList(Node head) {
            if(head == null || head.next == null){
                return head;
            }
            Node newHead =reverseList(head.next);
            head.next.next = head;
            head.next = null;
         return newHead; }
        }    

//Kunal's recurssive solution
     class Recurssivereverse {
            public Node head;
            public Node tail;
            private void reverse(Node node) {
                if (node.next == null) {
                    head = tail;
                    return;
                }
                reverse(node.next);
                tail.next = node;
                tail = node;
                tail.next = null;
            }
            
        }
    

