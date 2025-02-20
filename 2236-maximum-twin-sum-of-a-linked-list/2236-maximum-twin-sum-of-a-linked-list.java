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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode sh=rev(slow);
        ListNode fh=head;
        int max=0;
        while(sh!=null){
            max=Math.max(max,fh.val+sh.val);
            sh=sh.next;
            fh=fh.next;
        }
        return max;
    }
}