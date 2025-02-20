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
    public ListNode rev(ListNode head){
            ListNode ans=null;
            ListNode ref=head;
            ListNode n;
            while(ref!=null){
                n=ref.next;
                ref.next=ans;
                ans=ref;
                ref=n;
            }
            return ans;
        }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sh=rev(slow);
        ListNode fh=head;
        while(sh!=null){
            if(sh.val!=fh.val){
                return false;
            }
            sh=sh.next;
            fh=fh.next;
        }
        return true;
    }
}