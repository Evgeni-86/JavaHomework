package mult;

public class Multi extends Thread implements Runnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("AAA");
            }
        };

        Runnable runnable1 = () -> {
            System.out.println("BBB");
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("DDD");
            }
        }).start();

        new Thread(() -> {
            System.out.println("EEE");
        }).start();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        Multi multi = new Multi();
        Thread thread3 = new Thread(multi);

        thread1.start();
        thread2.start();
        multi.start();
        thread3.start();
    }

    @Override
    public void run() {
        System.out.println("CCC");
    }
}
