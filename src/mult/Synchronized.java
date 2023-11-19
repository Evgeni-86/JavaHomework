package mult;


//Синхронизация метода
//Синхронизация статики блокирует весь класс, а не статики его экземпляр
public class Synchronized extends Thread {
    public static volatile int a;

    public static synchronized void test() {
        for (int i = 0; i < 100; i++) {
            a++;
            System.out.println(a);
        }
    }

    @Override
    public void run() {
        test();
    }

    public static void main(String[] args) throws InterruptedException {
        Synchronized thread1 = new Synchronized();
        Synchronized thread2 = new Synchronized();
        Synchronized thread3 = new Synchronized();
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(Synchronized.a);
    }
}
