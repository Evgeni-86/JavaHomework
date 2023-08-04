//Напишите Java-программу для получения обхода значений ее узлов заданного двоичного дерева.

package Kodesource;

import Kodesource.Resurses.NodeTest1;

import java.util.LinkedList;

public class T126 {

    public static void main(String[] args) {
        NodeTest1 head = createNodes();

        test(head);

//        LinkedList<NodeTest1> nodes = new LinkedList<>();
//        nodes.addLast(head);

    }

    static public void test(NodeTest1 node) {

        if (node.left != null){
            test(node.left);
        }
        System.out.print(node.value + " ");

        if (node.right != null){
            test(node.right);
        }

    }





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
