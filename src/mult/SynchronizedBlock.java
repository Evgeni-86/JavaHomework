package mult;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlock implements Runnable {

    int counter = 0;
    List<Integer> integers = new ArrayList<>();

    public void test() {
        synchronized (this) {
            while (counter <= 200) {
                integers.add(counter++);
                System.out.println("work " + Thread.currentThread().getName());
            }
        }

        for (int a : integers) {
            //теперь операция атамарна
            synchronized (this) {
                System.out.println("work thread : " + Thread.currentThread().getName() + ", int = " + a);
            }
        }
    }

    @Override
    public void run() {
        test();
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlock synchronizedBlock1 = new SynchronizedBlock();
        Thread thread1 = new Thread(synchronizedBlock1);
        Thread thread2 = new Thread(synchronizedBlock1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizedBlock1.integers);
    }
}
