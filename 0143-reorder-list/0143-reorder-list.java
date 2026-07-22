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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=second;

        while(curr!=null){

            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode firstCurrent=head;
        ListNode secondCurrent=prev;

        while(secondCurrent!=null){

            ListNode firstnext=firstCurrent.next;
            ListNode secondnext=secondCurrent.next;

            firstCurrent.next = secondCurrent;
            secondCurrent.next = firstnext;

            firstCurrent=firstnext;
            secondCurrent=secondnext;
        }
    }
}