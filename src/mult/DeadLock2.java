package mult;

public class DeadLock2 extends Thread {
    public static synchronized void methodOne() {
        while (true) {
            System.out.printf("Thread [%s] block static DeadLock2", Thread.currentThread().getName());
            System.out.println(" methodOne");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            methodTwo();
        }
    }

    public static synchronized void methodTwo() {
        while (true) {
            System.out.printf("Thread [%s] block static DeadLock2", Thread.currentThread().getName());
            System.out.println(" methodTwo");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            methodOne();
        }
    }
}

class DeadLock2Test {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new DeadLock2(){
            @Override
            public void run() {
                methodOne();
            }
        });
        Thread thread2 = new Thread(new DeadLock2(){
            @Override
            public void run() {
                methodTwo();
            }
        });

        thread1.start();
        thread2.start();
    }
}