package mult;

import java.util.*;
import java.util.stream.Collectors;

public class WaitAndNotify implements Runnable {
    int counterStop = 5;
    int a = 0; //НЕ ОБЯЗАТЕЛЬНО VOLATILE Т.К. ПРИ ПОЛУЧЕНИИ МОНИТОРА ЗНАЧЕНИЯ ОБНОВЛЯЮТСЯ
    int[] array = new int[10];

    public synchronized void doSome() throws InterruptedException {

        if (a == 0) {

            for (int i = 0; i < counterStop; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[j] = (int) (Math.random() * 10);
                }
                System.out.printf("Random array %s\n", Arrays.toString(array));
                a = 1;
                this.wait();
                this.notify();
            }

        } else if (a == 1) {

            for (int i = 0; i < counterStop; i++) {
                Arrays.sort(array);
                System.out.printf("Sorted array %s\n", Arrays.toString(array));
                System.out.println("===========================================");
                a = 0;
                notify();
                wait();
            }

        }
    }

    @Override
    public void run() {
        try {
            doSome();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(waitAndNotify);
        Thread thread2 = new Thread(waitAndNotify);
        thread1.start();
        thread2.start();
    }
}
