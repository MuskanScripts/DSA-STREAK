package Revise;

public class LinkedListCycleII {
    public Node detectCycle(Node head) {
        Node slow  = head;
        Node ok = head;
        Node fast = head;
        boolean check = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                check = true;
                break;
            }
        }
       if(check){
          while(slow != ok){
         slow = slow.next;
         ok = ok.next;
       }
       return slow;
       }
    return null;}
}
