package DZ5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

//TODO: Методы offer???
public class DequePriorityQueueTest {
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>() {{
            add(1);
            add(2);
        }};
        System.out.println(integers.offer(3));
        System.out.println(integers.pollFirst());
        System.out.println(integers.pollFirst());
        System.out.println(integers.pollFirst());
        System.out.println(integers.pollFirst());
        System.out.println(integers);

        Queue<Test> queue = new PriorityQueue<>() {{
            add(new Test("E"));
            add(new Test("C"));
            add(new Test("A"));
            add(new Test("D"));
            add(new Test("B"));
        }};
        System.out.println(queue);
        queue.offer(new Test("F"));
//        while (!queue.isEmpty())
//            System.out.println(queue.poll());

        for (int i = 0; i < 10; i++) {
            Test temp = queue.poll();
            if (temp != null)
                System.out.println("Элемент извлечен из очереди : " + temp);
            else System.out.println("Элементы в очереди закончились");
        }
    }
}


class Test implements Comparable<Test> {
    String s;

    public Test(String s) {
        this.s = s;
    }

    @Override
    public int compareTo(Test o) {
        return s.compareTo(o.s);
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                '}';
    }
}
