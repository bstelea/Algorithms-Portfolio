/**
 * Solution
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    // Helper function to parse int array to Linked List
    public ListNode parseArrayToLinkedList(int[] list) {
        int n = list.length;
        if (n == 0)
            return null;
        ListNode head = new ListNode();
        ListNode ans = head;

        for (int i = 0; i < n - 1; i++) {
            ans.val = list[i];
            ListNode next = new ListNode();
            ans.next = next;
            ans = ans.next;
        }

        ans.val = list[n - 1];
        ans.next = null;

        return head;
    }
    // Helper function to print Linked List elements
    public void printLinkedList(ListNode head) {
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
    }

    // Solution function
    // Recursive version
    public ListNode rreverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode newHead = rreverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Solution function
    // Iterative version
    public ListNode ireverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode currentNext = head.next;
            head.next = prev;
            prev = head;
            head = currentNext;
        }
        return prev;
    }
}