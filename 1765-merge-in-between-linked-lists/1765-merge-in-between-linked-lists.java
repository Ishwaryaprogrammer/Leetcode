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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ref1=list1;
        for(int i=0;i<a-1;i++){
            ref1=ref1.next;
        }
        ListNode ref3=list1;
        for(int i=0;i<b;i++){
            ref3=ref3.next;
        }
        ref1.next=list2;
        
        ListNode ref2=list2;
        while(ref2.next!=null){
            ref2=ref2.next;
        }
        ref2.next=ref3.next;;
        return list1;
    }
}