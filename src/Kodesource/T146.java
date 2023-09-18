/*Напишите программу на Java для преобразования отсортированного
массива в двоичное дерево поиска. Поддерживать минимальную высоту дерева. Перейти к редактору
Пример вывода:
T146

2
1
4
6
5
3
*/
package Kodesource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T146 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Node node = test(arr);
        System.out.println("----------------");

        Queue<Node> stack = new LinkedList<>();
        stack.add(node);
        while (stack.size() > 0) {
            Node currentNode = stack.poll();
            System.out.println(currentNode.value);
            if (currentNode.left != null) {
                stack.add(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
            }
        }
    }

    //            4
    //      2           6
    //   1     3    5       7
    //                         8
    public static Node test(int[] arr) {
        if (arr.length < 1) {
            return null;
        }

        int pivotIndex = (arr.length - 1) / 2;
        Node centralElem = new Node(arr[pivotIndex]);
        centralElem.left = test(Arrays.copyOfRange(arr, 0, pivotIndex));
        centralElem.right = test(Arrays.copyOfRange(arr, pivotIndex + 1, arr.length));

        return centralElem;
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
