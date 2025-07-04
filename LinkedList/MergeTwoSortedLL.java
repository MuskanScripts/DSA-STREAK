public class MergeTwoSortedLL {
    // Merge two sorted linked lists and return it as a new sorted list.
    //time complexity O(N+M) and space complexity O(1)
    // where N is the length of first linked list and M is the length of second linked list.
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode ans = new ListNode(0);
        ListNode d = ans;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
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

//Kunal's code of merge
class InnerMergeTwoSortedLL {

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
}