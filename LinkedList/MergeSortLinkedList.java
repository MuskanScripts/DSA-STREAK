public class MergeSortLinkedList {
    // Merge MergeSortLinkedListd lists and return it as a new sorted list.
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
    public ListNode mergeSort(ListNode head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find the middle of the linked list
        ListNode mid = FindMiddleElement.findMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; // split the linked list into two halves

        // recursively sort the left and right halves
        left = mergeSort(left);
        right = mergeSort(right);

        // merge the sorted halves
        return merge(left, right);
    }
}
