/*
Напишите программу на Java, чтобы найти максимальную глубину заданного двоичного дерева. Перейти к редактору
Пример вывода: Максимальная глубина двоичного дерева: 3
*/

package Kodesource;

import Kodesource.Resurses.NodeTest1;

import java.util.LinkedList;

public class T130 {
    public static void main(String[] args) {
        NodeTest1 head = NodeTest1.createNodes();
        System.out.println(test(head));
    }

    static public int test(NodeTest1 head){

        LinkedList<NodeTest1> stack = new LinkedList<>();
        stack.add(head);

        int counterLeft = 0;
        int counterRight = 0;

        while (stack.size() > 0){
            NodeTest1 curNode = stack.removeFirst();
            if (curNode.left != null){
                stack.addLast(curNode.left);
                counterLeft++;
            }
            if (curNode.right != null) {
                stack.addLast(curNode.right);
                counterRight++;
            }
        }
        return Math.max(counterLeft, counterRight);
    }
}
