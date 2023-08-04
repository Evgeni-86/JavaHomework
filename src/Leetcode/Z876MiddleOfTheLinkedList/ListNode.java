package Leetcode.Z876MiddleOfTheLinkedList;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this(val);
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;

    }
}

class Test {
    public static void main(String[] args) {

        ListNode listNodeHead = new ListNode(1);
        ListNode nextNode = listNodeHead;
        for (int i = 0; i < 13; i++) {
            nextNode.next = new ListNode(nextNode.val + 1);
            nextNode = nextNode.next;
        }

        midle(listNodeHead);
    }

    static void midle(ListNode head) {
        ListNode start = head;
        int length = 0;

        while (start.next != null) {
            start = start.next;
            length++;
        }
        System.out.println(length);

        start = head;
        for (int i = 0; i < length; i++) {
            if (i >= length / 2) {
                int cur = head.val;
                System.out.print(cur + " ");
            }
            head = head.next;
        }

    }
}
