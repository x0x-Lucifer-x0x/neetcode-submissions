class Solution {
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        }

        if (second != null) {
            tail.next = second;
        }

        return head.next;
    }
}