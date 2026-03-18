class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}

public class LinkedListCycleTest {
    public static void main(String[] args) {

        // Creating nodes
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating a cycle: last node points back to second node
        fourth.next = second;

        Solution obj = new Solution();
        boolean result = obj.hasCycle(head);

        System.out.println(result);
    }
}