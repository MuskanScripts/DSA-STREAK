package LinkedList;
public class MergeTwoSortedLL {
    // Merge two sorted linked lists and return it as a new sorted list.
    //time complexity O(N+M) and space complexity O(1)
    // where N is the length of first linked list and M is the length of second linked list.
    public static Node merge(Node head1,Node head2){
        Node ans = new Node(0);
        Node d = ans;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                d.next = temp1;
                temp1 = temp1.next;
            }else{
                d.next = temp2;
                temp2 = temp2.next;
            }
            d = d.next;
        }
        while(temp1 != null){
            d.next = temp1;
            temp1 = temp1.next;
            d = d.next;
        }
        while(temp2 != null){
            d.next = temp2;
            temp2 = temp2.next;
            d = d.next;
        }
        return ans.next;
    }
}
