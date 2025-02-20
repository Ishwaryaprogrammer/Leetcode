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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode l1=rev(list1);
        ListNode l2=rev(list2);
        ListNode dummy=new ListNode(0);
        ListNode ref=dummy;
        int carry=0,rem;
        while(l1!=null || l2!=null || carry!=0){
            int num=0;
            if(l1!=null && l2!=null){
                num=carry+l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }else if(l1!=null){
                num=carry+l1.val;
                l1=l1.next;
            }else if(l2!=null){
                num=carry+l2.val;
                l2=l2.next;
            }else{
                num=carry;
            }
            rem=num%10;
            carry=num/10;
            ListNode newNode =new ListNode(rem);
            ref.next=newNode;
            ref=ref.next;
        }
        
        return rev(dummy.next);
    }
}