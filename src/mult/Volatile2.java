package mult;

public class Volatile2 implements Runnable {
    public boolean isRun = true;

    @Override
    public void run() {
        while (isRun) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

//            System.out.println("Tik");

//            if (!isRun)
//                return;
        }
    }
}


class ClockManager {
    static boolean isClockRun = true;

    public static void main(String[] args) throws InterruptedException {
        Volatile2 volatile2 = new Volatile2();
        Thread thread = new Thread(volatile2);
        thread.start();
        Thread.sleep(10000);
//        isClockRun = false;
        volatile2.isRun = false;
    }
}