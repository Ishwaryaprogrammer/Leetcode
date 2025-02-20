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
    public int gcd(int x, int y) 
    { 
        if (y == 0) 
            return x; 
        return gcd(y, x % y); 
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ref1=head;
        ListNode ref2=head.next;
        while(ref2!=null ){
            ListNode newNode=new ListNode(gcd(ref1.val,ref2.val));
            ref1.next=newNode;
            newNode.next=ref2;
            ref1=ref2;
            ref2=ref2.next;
        }
        return head;
    }
}