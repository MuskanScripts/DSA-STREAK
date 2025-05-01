package LinkedList;

public class RemoveNthNode {
    // using brute force approach to remove the nth node from end of linked list
    // time complexity O(N+N-n) and space complexity O(1)
    public static Node removeNthNodeFromEnd(Node head,int n){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp =temp.next;
        }
        if(count == n){
            return head.next;
        }
       
        temp = head;
        int ans = count - n-1;
        while(ans != 0){
          ans--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
