public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] list1 = {1, 2, 4};

        ListNode l1 = sol.parseArrayToLinkedList(list1);

        sol.printLinkedList(l1);

        // ListNode head = sol.rreverseList(l1);
        // sol.printLinkedList(head);

        ListNode head1 = sol.ireverseList(l1);
        sol.printLinkedList(head1);
    }
}
