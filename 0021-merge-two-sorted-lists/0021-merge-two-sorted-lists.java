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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dum=new ListNode(0);
        ListNode ref=dum;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ref.next=list1;
                list1=list1.next;
            }else{
                ref.next=list2;
                list2=list2.next;
            }
            ref=ref.next;
        }
        ref.next=(list1!=null)?list1:list2;
        return dum.next;
    }
}