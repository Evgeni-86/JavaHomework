package mult;



class ObjectOne implements Runnable {
    public static synchronized void methodOne() {
            while (true) {
                System.out.printf("Thread [%s] block static ObjectOne\n", Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ObjectTwo.methodTwo();
            }
    }

    @Override
    public void run() {
        methodOne();
    }
}
class ObjectTwo implements Runnable {
    public static synchronized void methodTwo() {
        while (true) {
            System.out.printf("Thread [%s] block static ObjectTwo\n", Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ObjectOne.methodOne();
        }
    }

    @Override
    public void run() {
        methodTwo();
    }
}

public class DeadLockTest {
    public static void main(String[] args) {

        ObjectOne objectOne = new ObjectOne();
        ObjectTwo objectTwo = new ObjectTwo();

        Thread thread1 = new Thread(objectOne);
        Thread thread2 = new Thread(objectTwo);

        thread1.start();
        thread2.start();
    }
}
