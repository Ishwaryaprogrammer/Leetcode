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
    public ListNode reverseList(ListNode head) {
        ListNode ref=head;
        ListNode ans=null;
        ListNode n;
        while(ref!=null){
            n=ref.next;
            ref.next=ans;
            ans=ref;
            ref=n;
        }
        return ans;
    
    }
}