/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ref1=head;
        ListNode ref2=head;
        //if(head.next==null){ return null;}
        for(int i=0;i<n;i++){
            ref1=ref1.next;
        }
        if(ref1==null)return head.next;
        while(ref1.next!=null){
            ref1=ref1.next;
            ref2=ref2.next;
        }
        ref2.next=ref2.next.next;
        
        return head;
    }
}