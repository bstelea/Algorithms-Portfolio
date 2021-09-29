public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};

        ListNode l1 = sol.parseArrayToLinkedList(list1);
        ListNode l2 = sol.parseArrayToLinkedList(list2);

        sol.printLinkedList(l1);
        sol.printLinkedList(l2);

        // ListNode head = sol.imergeTwoLists(l1, l2);
        ListNode head = sol.rmergeTwoLists(l1, l2);
        sol.printLinkedList(head);
    }
}
