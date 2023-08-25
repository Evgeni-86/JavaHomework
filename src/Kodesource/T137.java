/*
137. Напишите программу на Java, чтобы найти возможные уникальные пути, учитывающие
 некоторые препятствия, от верхнего левого угла до правого нижнего угла данной
 сетки (mxn).

Примечание: Вы можете двигаться вниз или вправо в любой момент времени, и
 препятствие и пустое пространство помечаются как 1 и 0 соответственно в сетке.
Пример сетки:
int [] [] tactcle_Grid = {
{0, 0, 0},
{0, 1, 0},
{0, 0, 0},
};
Пример вывода: Уникальные пути из верхнего левого угла в правый нижний угол указанной сетки (с учетом некоторых препятствий): 2
*/

package Kodesource;

import java.util.LinkedList;

public class T137 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;

        int[] blockPoint = new int[]{1, 1};

        System.out.println(test(x, y, blockPoint));
    }

    public static int test(int x, int y, int[] blockPoint) {

        int ways = 0;

        Integer[] startPoint = {0, 0};

        LinkedList<Integer[]> stack = new LinkedList<>();
        stack.add(startPoint);

        while (stack.size() > 0) {

            Integer[] currentPoint = stack.removeFirst();
            if (currentPoint[0] == blockPoint[0] && currentPoint[1] == blockPoint[1]){
                continue;
            }

            if (currentPoint[0] == x - 1 && currentPoint[1] == y - 1) {
                ways++;
            }

            if (currentPoint[0] + 1 <= x - 1) {
                stack.add(new Integer[]{currentPoint[0] + 1, currentPoint[1]});
            }
            if (currentPoint[1] + 1 <= y - 1) {
                stack.add(new Integer[]{currentPoint[0], currentPoint[1] + 1});
            }

        }

        return ways;
    }
}
