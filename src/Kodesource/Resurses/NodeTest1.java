package Kodesource.Resurses;

import java.util.LinkedList;

public class NodeTest1 {

    public int value;
    public NodeTest1 left;
    public NodeTest1 right;

    public NodeTest1(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeTest1{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    static public NodeTest1 createNodes() {
        NodeTest1 head = new NodeTest1(10);

        LinkedList<NodeTest1> nodes = new LinkedList<>();
        nodes.add(head);

        int num = head.value;
        for (int i = 0; i < 4; i++) {
            NodeTest1 curNode = nodes.removeFirst();

            curNode.left = new NodeTest1(num += 10);
            nodes.addLast(curNode.left);

            curNode.right = new NodeTest1(num += 10);
            nodes.addLast(curNode.right);
        }
        return head;
    }

}
