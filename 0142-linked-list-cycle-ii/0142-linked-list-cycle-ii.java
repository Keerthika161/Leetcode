/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashSet<ListNode> set = new HashSet<>();
         //ListNode slow = head;
         //stNode fast = head;

        while (head != null) {
            if (set.contains(head)) {
                return head;
            }

            set.add(head);
            head = head.next;
        }

        return null;
    }
}