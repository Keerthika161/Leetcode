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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ArrayList<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        int n = list.size();
        k %= n;

        if (k == 0) {
            return list.get(0);
        }

        list.get(n - 1).next = list.get(0);

        list.get(n - k - 1).next = null;

        return list.get(n - k);
    }
}