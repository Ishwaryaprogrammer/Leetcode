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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        ListNode ref=head.next;
        int sum=0;
        while(ref!=null){
            if(ref.val!=0){
                sum+=ref.val;
            }else{
                ListNode newNode=new ListNode(sum);
                res.next=newNode;
                res=res.next;
                sum=0;
            }
            ref=ref.next;
        }
        return dummy.next;
    }
}