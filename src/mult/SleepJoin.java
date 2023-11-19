package mult;

import java.time.LocalTime;

public class SleepJoin {
    public static void main(String[] args) {
        System.out.println("----SLEEP-------");
        System.out.println("thread1 " + LocalTime.now());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread1 " + LocalTime.now());

        System.out.println("-----JOIN----------");
        Thread thread = new Thread(()-> {
            System.out.println("thread 1 start");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 1 end");
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("current thread main");
    }
}
