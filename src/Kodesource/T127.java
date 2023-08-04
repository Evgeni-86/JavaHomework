//Напишите программу на Java, чтобы получить обход Postorder значений своих узлов заданного двоичного дерева

package Kodesource;

import Kodesource.Resurses.NodeTest1;

import java.util.LinkedList;

public class T127 {
    public static void main(String[] args) {
        NodeTest1 head = NodeTest1.createNodes();
        test(head);
    }

    static public void test(NodeTest1 node) {


        if (node.left != null){
            test(node.left);
        }


        if (node.right != null){
            test(node.right);
        }

        System.out.println(node.value);
    }

}
