//Напишите программу на Java, чтобы получить предварительный обход значений ее узлов заданного двоичного дерева.

package Kodesource;

import Kodesource.Resurses.NodeTest1;

import java.util.LinkedList;

public class T125 {

    public static void main(String[] args) {

        NodeTest1 head = createNodes();

        test(head);
    }

    static public void test(NodeTest1 node) {

        System.out.println(node.value);

        if (node.left != null){
            test(node.left);
        }
        if (node.right != null){
            test(node.right);
        }

    }


//    static public void test(LinkedList<NodeTest1> stack) {
//        if (stack.size() == 0) {
//            return;
//        }
//
//        NodeTest1 curNode = stack.removeFirst();
//        System.out.print(curNode.value + " ");
//
//        if (curNode.left != null) {
//            stack.addLast(curNode.left);
//        }
//        if (curNode.right != null) {
//            stack.addLast(curNode.right);
//        }
//
//        test(stack);
//    }


    static public NodeTest1 createNodes() {
        NodeTest1 head = new NodeTest1(10);

        LinkedList<NodeTest1> nodes = new LinkedList<>();
        nodes.add(head);

        int num = head.value;
        for (int i = 0; i < 2; i++) {
            NodeTest1 curNode = nodes.removeFirst();

            curNode.left = new NodeTest1(num += 10);
            nodes.addLast(curNode.left);

            curNode.right = new NodeTest1(num += 10);
            nodes.addLast(curNode.right);
        }
        return head;
    }
}
