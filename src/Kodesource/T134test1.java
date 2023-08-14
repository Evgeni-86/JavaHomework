package Kodesource;

import java.util.ArrayList;
import java.util.LinkedList;

public class T134test1 {
    public static void main(String[] args) {
        test(0,5);
    }

    public static void test(int start, int target) {
        class Node {
            int sum;
            ArrayList<Integer> road = new ArrayList<>();
            public Node(int sum) {
                this.sum = sum;
            }
        }
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(new Node(start));

        int[] stepsVariants = {1, 2};
        while (stack.size() > 0) {
            Node currentNode = stack.removeFirst();
            if (currentNode.sum == target) {
                System.out.println(currentNode.road);
            } else if (currentNode.sum < target) {
                for (int i = stepsVariants.length - 1; i >= 0; i--) {
                    Node newNode = new Node(currentNode.sum + stepsVariants[i]);
                    newNode.road.addAll(currentNode.road);
                    newNode.road.add(stepsVariants[i]);
                    stack.addFirst(newNode);
                }
            }
        }
    }
}
