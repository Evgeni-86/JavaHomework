
//package LeetCode.Easy;

public class RemoveDuplicatesFromSortedList_83 {


    public static void main(String[] args) {

        ListNode head = new ListNode();
        ListNode temp = head;

        int value = 1;
        for (int i = 0; i < 9; i++) {
            temp.next = new ListNode(value);
            temp = temp.next;
            if (i % 2 == 0) {
                value++;
            }
        }

        temp = deleteDuplicates(head);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        ListNode currentNode = head;
        while (head != null) {
            if (head.val != currentNode.val) {
                currentNode.next = head;
                currentNode = head;
            }
            head = head.next;
            currentNode.next = null;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
