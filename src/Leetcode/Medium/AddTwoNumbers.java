/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
*/

package Leetcode.Medium;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = ListNode.greatListNode(2, 2);
        ListNode l2 = ListNode.greatListNode(7, 3);
        ListNode head = test(l1, l2);
        while (true) {
            if (head.next != null) {
                System.out.print(head.val + " ");
                head = head.next;
            } else {
                System.out.println(head.val);
                break;
            }
        }
    }

    static ListNode test(ListNode l1, ListNode l2) {


        StringBuilder sbL1 = new StringBuilder(String.valueOf(l1.val));
        StringBuilder sbL2 = new StringBuilder(String.valueOf(l2.val));
        while (l1.next != null || l2.next != null) {
            if (l1.next != null) {
                sbL1.append(l1.next.val);
                l1 = l1.next;
            }
            if (l2.next != null) {
                sbL2.append(l2.next.val);
                l2 = l2.next;
            }
        }

        int sbL1_lastIndex = sbL1.reverse().length() - 1;
        int sbL2_lastIndex = sbL2.reverse().length() - 1;

        int ostatoc = 0;

        ListNode head = new ListNode(0);
        ListNode curNode = head;

        while (sbL1_lastIndex >= 0 || sbL2_lastIndex >= 0) {
            int sum = ostatoc;

            if (sbL1_lastIndex >= 0) {
                sum += Integer.parseInt(String.valueOf(sbL1.charAt(sbL1_lastIndex)));
            }
            if (sbL2_lastIndex >= 0) {
                sum += Integer.parseInt(String.valueOf(sbL2.charAt(sbL2_lastIndex)));
            }

            if (Math.max(sbL1_lastIndex, sbL2_lastIndex) == 0 && sum < 10) {
                curNode.val = sum % 10;//правая цифра
                break;
            }

            curNode.val = sum % 10;//правая цифра
            ostatoc = sum / 10;//левая цифра
            curNode.next = new ListNode(ostatoc);
            curNode = curNode.next;
            sbL1_lastIndex--;
            sbL2_lastIndex--;
        }

        return head;

    }
}


/////////////////////////////////////////////////
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;

    }

    //для создания связанного списка
    static ListNode greatListNode(int number, int counter) {
        ListNode head = new ListNode(number);
        ListNode nextNode = head;
        for (int i = 0; i < counter; i++) {
            nextNode.next = new ListNode(nextNode.val + 2);
            nextNode = nextNode.next;
        }
        return head;
    }

}
