package questions;


public class Solution extends Thread {

    public synchronized void methodOne() {
        while (true){
            System.out.println("methodOne work");
        }
    }

    public synchronized void methodTwo() {
        while (true){
            System.out.println("methodTwo work");
        }
    }

}

class SolutionTest {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Solution(){
            @Override
            public void run() {
                methodOne();
            }
        });
        Thread thread2 = new Thread(new Solution(){
            @Override
            public void run() {
                methodTwo();
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.interrupt();
    }
}

