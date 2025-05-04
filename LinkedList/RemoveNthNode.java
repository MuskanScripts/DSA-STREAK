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
class Main {
    // using two pointer approach to remove the nth node from end of linked list
    // time complexity O(N) and space complexity O(1)
    public static Node DeleteNthNodefromEnd(Node head, int N) {
        Node fastp = head;
        Node slowp = head;
        for (int i = 0; i < N; i++)
            fastp = fastp.next;
        if (fastp == null)
            return head.next;
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }
        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }   
}
