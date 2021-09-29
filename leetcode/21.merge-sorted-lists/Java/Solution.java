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
    public ListNode rmergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = rmergeTwoLists(l1.next, l2);
            return l1;
        }
        l2.next = rmergeTwoLists(l1, l2.next);
        return l2;
    }

    // Solution function
    // Iterative version
    public ListNode imergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) 
            p.next = l1;
        if (l2 != null)
            p.next = l2;
        return head.next;
    }
}