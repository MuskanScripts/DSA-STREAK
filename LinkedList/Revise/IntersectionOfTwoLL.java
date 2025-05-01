package LinkedList.Revise;

import java.util.HashSet;

import LinkedList.Node;

public class IntersectionOfTwoLL {
    // 1st solution using two pointer approach
    // time complexity O(N) and space complexity O(1)
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null) return null;
    
        Node a = headA;
        Node b = headB;
    
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
    
        return a;
    }
}
//1st solution using brute force approach
// time complexity O(N^2) and space complexity O(1)
class other{
    static Node intersectionPresent(Node head1,Node head2) {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                //if both nodes are same
                if(temp == head2) return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }
        //intersection is not present between the lists return null
        return null;
    }
}
//3rd solution using Hashing
// time complexity O(N) and space complexity O(N)
class ok{
    static Node intersectionPresent(Node head1,Node head2) {
        HashSet<Node> st=new HashSet<>();
       while(head1 != null) {
          st.add(head1);
          head1 = head1.next;
       }
       while(head2 != null) {
           if(st.contains(head2)) return head2;
           head2 = head2.next;
       }
       return null;
   
   }
   
}
