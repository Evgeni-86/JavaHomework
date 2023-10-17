
package Leetcode.Easy;

/*
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/

import java.util.*;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1nod3 = new ListNode(4);
        ListNode list1nod2 = new ListNode(2, list1nod3);
        ListNode list1nod1 = new ListNode(1, list1nod2);

        ListNode list2node2 = new ListNode(6);
        ListNode list2node3 = new ListNode(3, list2node2);

        ListNode rez = test(list1nod1, list2node3);
        while (rez != null){
            System.out.println(rez.val);
            rez = rez.next;
        }

    }

    public static ListNode test(ListNode listNode1, ListNode listNode2) {

        ListNode head  = null;
        ListNode headTemp  = null;

        while (listNode1 != null || listNode2 != null) {
            ListNode node;
            if (listNode1 != null && listNode2 != null && listNode1.val <= listNode2.val) {
                node = listNode1;
                listNode1 = listNode1.next;
            } else if (listNode2 != null) {
                node = listNode2;
                listNode2 = listNode2.next;
            } else {
                node = listNode1;
                listNode1 = listNode1.next;
            }

            if (head == null) {
                head = node;
                headTemp = head;
            } else {
                headTemp.next = node;
                headTemp = headTemp.next;
            }
        }

        return head;

    }

}


class ListNode {
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
