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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        head=rev(head);
        for(int i=0;head!=null;i++){
            if(head.val==1){
                sum=sum+ (int) Math.pow(2,i);
            }
            head=head.next;
        }
        return sum;
    }
}