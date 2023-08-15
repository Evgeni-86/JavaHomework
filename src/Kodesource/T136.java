/*
Напишите программу на Java, чтобы найти возможные уникальные пути от верхнего
левого угла до правого нижнего угла данной сетки (mxn). Перейти к редактору
Примечание: вы можете двигаться вниз или вправо в любой момент времени.
Пример вывода: Уникальные пути из левого верхнего угла в правый нижний угол указанной сетки: 3
*/

package Kodesource;

import java.util.LinkedList;

public class T136 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println(test(x,y));
    }

    public static int test(int x, int y) {
        int sum = 0;
        LinkedList<Integer[]> stack = new LinkedList<>();
        stack.add(new Integer[]{0, 0});

        while (stack.size() > 0) {
            Integer[] currentPoint = stack.removeFirst();
            if (currentPoint[0] == x - 1 && currentPoint[1] == y - 1) {
                sum++;
            }
            if (currentPoint[0] + 1 < x) {
                stack.add(new Integer[]{currentPoint[0] + 1, currentPoint[1]});
            }
            if (currentPoint[1] + 1 < y) {
                stack.add(new Integer[]{currentPoint[0], currentPoint[1] + 1});
            }
        }
        return sum;
    }
}
