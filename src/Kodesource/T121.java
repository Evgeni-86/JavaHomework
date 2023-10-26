////Напишите Java-программу для реверса связанного списка.
//
//package Kodesource;
//
//import Leetcode.Z876MiddleOfTheLinkedList.ListNode;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class T121 {
//
//    public static void main(String[] args) {
//
//        ListNode listNodeHead = new ListNode(10);
//        ListNode nextNode = listNodeHead;
//        for (int i = 0; i < 4; i++) {
//            nextNode.next = new ListNode(nextNode.val + 10);
//            nextNode = nextNode.next;
//        }
//
//        test(listNodeHead);
//
//    }
//
//
//    public static void test(ListNode head) {
//        LinkedList<ListNode> stack = new LinkedList<>();
//
//        ListNode temp = head;
//        while (head != null) {
//            System.out.println(head.val);
//            temp = head;
//            head = head.next;
//            temp.next = null;
//            stack.addFirst(temp);
//        }
//        System.out.println("-------------------------");
//
//        ListNode head2 = stack.getFirst();
//        ListNode prev = null;
//        for (ListNode listNode : stack) {
//
//            if (prev == null) {
//                prev = listNode;
//            } else {
//                prev.next = listNode;
//                prev = listNode;
//            }
//
//        }
//
//        ListNode nextNode2 = head2;
//        while (nextNode2 != null) {
//            System.out.println(nextNode2.val);
//            nextNode2 = nextNode2.next;
//        }
//
//
//
//    }
//
//}
